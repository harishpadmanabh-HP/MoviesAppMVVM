package com.hp.moviesappmvvm.Retro;

import com.hp.moviesappmvvm.NetworkConfigs.Configs;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetroConfig {
    public Apis getApi()
    {
        //build retrofit object
        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl(Configs.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        //connect api class with this builder

        Apis apis=retrofit.create(Apis.class);
        return apis;
    }
}
