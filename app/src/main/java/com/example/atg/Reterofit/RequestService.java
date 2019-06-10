package com.example.atg.Reterofit;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RequestService
{
    @GET("services/rest/?method=flickr.photos.getRecent&per_page=4&page=1&api_key=6f102c62f41998d151e5a1b48713cf13&format=json&nojsoncallback=1&extras=url_s")
    Call<Model> requestGet();

    @GET("services/rest/?method=flickr.photos.search&api_key=6f102c62f41998d151e5a1b48713cf13&format=json&nojsoncallback=1&extras=url_s&per_page=20&page=1")
    Call<Model> requestSearch(@Query("text") String string);
}
