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
	
    @PATCH ("/gists/{id}")
    Call<GistResponse> editGist(@Header("Authorization") String authToken, @Body RequestBody requestBody);

    @GET("/gists/public")
    Call<GistResponse> getPublicGists();
    
    @GET("/gists/{id}/commits")
    Call<List<GistResponse>>  listGistCommits(@Header("Authorization") String authToken, @Path("id") String gistId);
    
    @PUT("/gists/{id}/star")
    Call<GistResponse> starGist();
    
    @DELETE("/gists/{id}/star")
    Call<GistResponse> unstarGist();
    
    @GET("/gists/{id}/star")
    Call<GistResponse> gistIsStarred();
    
    @POST("/gists/{id}/forks")
    Call<GistResponse> forkGist();
    
}
