package com.hml.example.retrofitdemo;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Huangmingliang on 2016/6/21 0021.
 */
public class RetData {
    @SerializedName("telString")
    private String telString;

    @SerializedName("province")
    private String province;

    @SerializedName("carrier")
    private String carrier;

    public String getTelString() {
        return telString;
    }

    public String getProvince() {
        return province;
    }

    public String getCarrier() {
        return carrier;
    }
}
