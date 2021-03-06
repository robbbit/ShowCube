package com.appsomniac.movie.tv.showcube.config.nearby;

import com.appsomniac.movie.tv.showcube.other.Config;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by absolutelysaurabh on 6/10/17.
 */

public class PlaceApiClient {

    public static final String BASE_URL = Config.Places_base_url;
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
