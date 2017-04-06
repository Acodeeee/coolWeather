package com.autocompletedemo.wrf_mac.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * 向服务器请求数据
 * Created by wrf_mac on 2017/4/6.
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
