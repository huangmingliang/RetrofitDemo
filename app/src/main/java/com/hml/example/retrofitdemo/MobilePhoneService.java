package com.hml.example.retrofitdemo;

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Header;
import retrofit.http.Query;

/**
 * Created by Huangmingliang on 2016/6/21 0021.
 */
public interface MobilePhoneService {

    /**
     * @param apiKey  在API接口提供平台注册生成的唯一身边识别
     * @param tel      要查询的号码
     * @return        自定义的http请求结果返回类型
     */
    @GET("mobilephone")
    Call<ApiResponse> getMobilePhoneMsg(@Header("apikey")String apiKey, @Query("tel")String tel);
}
