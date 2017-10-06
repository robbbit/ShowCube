package com.appsomniac.showbox.config.theatre;

import com.appsomniac.showbox.model.nearby.PlaceApi;
import com.appsomniac.showbox.model.nearby.Theatre;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by absolutelysaurabh on 6/10/17.
 */

public class TheatreApiResponse {

    @SerializedName("results")
    private ArrayList<Theatre> results;

    @SerializedName("status")
    private String status;

    public String getPage() {
        return status;
    }

    public Theatre getResults() {
        return results.get(0);
    }

}