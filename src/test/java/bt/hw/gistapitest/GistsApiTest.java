package bt.hw.gistapitest;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;

import javax.json.Json;
import javax.json.JsonObject;

import org.junit.BeforeClass;
import org.junit.Test;

import bt.hw.gistapitest.pojo.GistResponse;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;

public class GistsApiTest {
	
	private static String GISTS_URL;
	private static String USER;
	private static String AUTH_TOKEN;
	
	@BeforeClass
	public static void loadConfigProperties() {
		Properties prop = new Properties();
		InputStream input = null;

		try {
			input = Properties.class.getResourceAsStream("/config/config.properties");

			if(input != null) {
				// load a properties file
				prop.load(input);
	
				GISTS_URL = prop.getProperty("gists_url");
				USER = prop.getProperty("user");
				AUTH_TOKEN = "Bearer "+prop.getProperty("auth_token");
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	
	@Test
	public void gistSimpleTest(){
		try {			
			String id = "";
			
			Retrofit retrofit = RetrofitClient.getClient(GISTS_URL);
			IGistsRestApi gistRestApi = retrofit.create(IGistsRestApi.class);	
			
			// Create a gist
			System.out.println("Create Gist Test");			
			JsonObject json = Json.createObjectBuilder()
			     .add("description", "Gist Test "+System.currentTimeMillis())
			     .add("public", Boolean.TRUE)
			     .add("files", Json.createObjectBuilder()
			             .add("fileX"+System.currentTimeMillis()+".txt", Json.createObjectBuilder()
					             .add("content", "Contents "+System.currentTimeMillis()))
			             .add("fileY"+System.currentTimeMillis()+".txt", Json.createObjectBuilder()
					             .add("content", "Contents "+System.currentTimeMillis()))
			             .add("fileZ"+System.currentTimeMillis()+".txt", Json.createObjectBuilder()
					             .add("content", "Contents "+System.currentTimeMillis()))				    		 
			    		).build();
					     
			System.out.println("Request body; "+json.toString());
			RequestBody requestBody = RequestBody.create(okhttp3.MediaType.parse("application/json; charset=utf-8"),
					                              json.toString());
			Call<GistResponse> create = gistRestApi.createGist(AUTH_TOKEN, requestBody);		
			Response<GistResponse> response = create.execute();
			id = response.body().getId();
			System.out.println(response.body().getId());
			assertEquals("Created", response.message());
		
			// Check if the gist was created and is listed
			System.out.println("Get Gists List Test");			
			Call<List<GistResponse>> getGistList = gistRestApi.getUserGists(AUTH_TOKEN, USER);
			Response<List<GistResponse>> responseList = getGistList.execute();
			Boolean idExists=false;
			for (GistResponse gist : responseList.body()) {
				//System.out.println(gist.getId());
				if (gist.getId().equals(id)) {
					idExists=true;
				}
			}
			assertTrue(idExists);
			
			
			// Delete the gist
			System.out.println("Delete gist: "+id);			
			Call<GistResponse> delete = gistRestApi.deleteGist(AUTH_TOKEN, id);
			Response<GistResponse> deleteResponse = delete.execute();			
			System.out.println("Html code: "+deleteResponse.code());
			assertTrue(response.isSuccessful());
		
			// Get the gist list again
			// And check if the gist was delete and is no longer listed
			getGistList = gistRestApi.getUserGists(AUTH_TOKEN, USER);
			responseList = getGistList.execute();
			idExists=true;
			for (GistResponse gist : responseList.body()) {
				//System.out.println(gist.getId());
				if (gist.getId().equals(id)) {
					idExists=false;
				}
			}
			assertTrue(idExists);
		
		} catch (IOException e) {
			e.printStackTrace();
			assertTrue(false);
		}		
	}
}
