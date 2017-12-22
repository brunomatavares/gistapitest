package bt.hw.gistapitest;


import java.util.List;

import bt.hw.gistapitest.pojo.GistResponse;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface IGistsRestApi {
 
    @POST("/gists")
    Call<GistResponse> createGist(@Header("Authorization") String authToken, @Body RequestBody requestBody);

    @GET("/users/{user}/gists")
    Call<List<GistResponse>> getUserGists(@Header("Authorization") String authToken, @Path("user") String user);

    @DELETE("/gists/{id}")
    Call<GistResponse> deleteGist(@Header("Authorization") String authToken, @Path("id") String gistId);
	
}
