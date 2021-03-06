package com.appsomniac.movie.tv.showcube.config.tv;

import com.appsomniac.movie.tv.showcube.other.Config;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by absolutelysaurabh on 23/9/17.
 */
public class TvApiClient {

    public static final String BASE_URL = Config.BASE_URL;
    private static Retrofit retrofit = null;

    public static Retrofit getClient() {
        if (retrofit==null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}