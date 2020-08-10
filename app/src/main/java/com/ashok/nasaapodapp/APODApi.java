package com.ashok.nasaapodapp;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface APODApi {

    @GET("planetary/apod")
    Observable<Response<List<APODModel>>> fetchAPODData(@Query("api_key") String apiKey, @Query("count") int count);
}
