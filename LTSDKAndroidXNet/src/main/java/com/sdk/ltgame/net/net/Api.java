package com.sdk.ltgame.net.net;


import android.app.Activity;

import com.sdk.ltgame.net.net.retrofit.RetrofitClient;


public class Api extends RetrofitClient {

    //测试服务器
    public static final String TEST_SERVER_URL="http://testgco.appcpi.com";
    //正式服务器
    public static final String FORMAL_SERVER_URL="https://gco.appcpi.com";


    private Api(String baseUrl) {
        super(baseUrl);
    }

    /**
     * 单例
     *
     * @param BaseUrl url
     */
    public static RetrofitService getInstance(Activity activity, String BaseUrl) {
        return new Api(BaseUrl).getRetrofit(activity).create(RetrofitService.class);
    }


}
