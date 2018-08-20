package com.realweather.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by thekey on 2018/8/20.
 */

public class HttpUtil {

    //相应Http请求
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback){

        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
