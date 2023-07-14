package com.example.coolweather.util;

import android.util.Log;

import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;

public class HttpUtil {
    public static void sendOkHttpRequest(String address, Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Log.d("request_url", address);
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
