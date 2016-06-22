package com.hml.example.retrofitdemo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit.Call;
import retrofit.Converter;
import retrofit.GsonConverterFactory;
import retrofit.Retrofit;

/**
 * Created by Huangmingliang on 2016/6/21 0021.
 *
 */
public class RestClient {
    String url="http://apis.baidu.com/apistore/mobilephoneservice/mobilephone";

    Gson gson=new GsonBuilder()
            .enableComplexMapKeySerialization()
            .setPrettyPrinting()
            .setVersion(1.0)
            .create();

    Retrofit retrofit=new Retrofit.Builder()
            .baseUrl(url)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build();

    public MobilePhoneService getMobilePhoneMsg(){
        MobilePhoneService service= retrofit.create(MobilePhoneService.class);
        return service;
    };
}
