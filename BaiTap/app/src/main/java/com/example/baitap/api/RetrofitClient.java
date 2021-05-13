package com.example.baitap.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

    private  static Retrofit retrofit;
    private static final String BASE_URL = "http://phamtuan0907.pythonanywhere.com/";

    public static Retrofit getRetrofitClient(){

        if(retrofit == null){

            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;

    }

}
