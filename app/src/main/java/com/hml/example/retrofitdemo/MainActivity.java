package com.hml.example.retrofitdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import retrofit.Call;
import retrofit.Callback;
import retrofit.Response;
import retrofit.Retrofit;

public class MainActivity extends AppCompatActivity {
    /*
     * 使用retrofit2.0框架进行号码归属地查询
     * 参考博客：http://www.jcodecraeer.com/a/anzhuokaifa/androidkaifa/2015/0915/3460.html
     * API接口：http://apistore.baidu.com/apiworks/servicedetail/117.html
     */
    private String TAG=getClass().getSimpleName();
    private String API_KEY="************";   //填写自己在上面api接口提供平台注册的apikey
    private String TEL="************";       //填写要查询的手机号码

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RestClient restClient=new RestClient();
        MobilePhoneService service=restClient.getMobilePhoneMsg();
        Call<ApiResponse> call=service.getMobilePhoneMsg(API_KEY,TEL);
        call.enqueue(new Callback<ApiResponse>() {
            @Override
            public void onResponse(Response<ApiResponse> response, Retrofit retrofit) {
                ApiResponse responseResult=response.body();
                RetData retData=responseResult.getRetData();
                Log.i(TAG,"errNum:"+responseResult.getErrNum()+" errMsg:"+responseResult.getErrMsg()+" retData:"+responseResult.getRetData());
                Log.i(TAG,"telString:"+retData.getTelString()+" province:"+retData.getProvince()+" carrier:"+retData.getCarrier());
            }
            @Override
            public void onFailure(Throwable t) {
                Log.e(TAG,"error:"+t.getMessage());
            }
        });

    }
}
