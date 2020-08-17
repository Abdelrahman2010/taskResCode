package com.adwya.task.data.remote.retrofitrepo;

import android.util.Log;

import androidx.annotation.NonNull;

import com.adwya.task.data.DataManager;
import com.adwya.task.data.prefs.PreferencesHelper;

import java.io.IOException;

import javax.inject.Inject;
import javax.inject.Singleton;


import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;


@Singleton
public class ApiInterceptor implements Interceptor {
    private final PreferencesHelper preferencesHelper;

    @Inject
    public ApiInterceptor(PreferencesHelper preferencesHelper){
        this.preferencesHelper = preferencesHelper;
    }

    @Override
    public Response intercept(@NonNull Chain chain) throws IOException {
        Request originalRequest = chain.request();
        HttpUrl originalHttpUrl = originalRequest.url();

        HttpUrl url = originalHttpUrl.newBuilder()
                .build();

        Request request = chain.request();
        if (preferencesHelper.getCurrentUserLoggedInMode() == DataManager.LoggedInMode.LOGGED_IN_MODE_LOGGED_OUT.getType()) {

            Log.d("LogState","Logedout");
            request = originalRequest.newBuilder().url(url)
                    .addHeader("Accept-Language", preferencesHelper.getLang())
                    .build();
        } else {
            request = originalRequest.newBuilder().url(url)
                    .addHeader("Accept-Language",  preferencesHelper.getLang())
                    .addHeader("Accept", "application/json")
                    .addHeader("Authorization", "Bearer " + preferencesHelper.getToken())
                    .build();


            Log.d("LogState","Logedin");
            Log.d("LogStateToken","Bearer " + preferencesHelper.getToken());

        }

//        request = originalRequest.newBuilder().url(url)
//                .addHeader("Accept-Language", preferencesHelper.getLang())
//                .build();
        return chain.proceed(request);
    }


}
