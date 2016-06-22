package com.hml.example.retrofitdemo;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Huangmingliang on 2016/6/21 0021.
 */
public class ApiResponse {
    @SerializedName("errNum")
    private int errNum;

    @SerializedName("errMsg")
    private String errMsg;

    @SerializedName("retData")
    private RetData retData;

    public int getErrNum() {
        return errNum;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public RetData getRetData() {
        return retData;
    }
}
