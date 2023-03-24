package com.example.projetofrases;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface API {
    String BASE_URL = "https://api.adviceslip.com";
    @GET("/advice")
    Call<Results> getAdvices();
}

