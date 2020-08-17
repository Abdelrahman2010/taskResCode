package com.adwya.task.data.remote;

import android.content.Context;

import com.adwya.task.data.model.Country;
import com.adwya.task.data.model.MyCity;
import com.adwya.task.data.model.SevenDays;
import com.adwya.task.data.model.Task;
import com.adwya.task.data.model.User;
import com.adwya.task.data.remote.retrofitrepo.ApiRequests;

import java.util.HashMap;

import javax.inject.Inject;


import io.reactivex.Single;

public class AppApiHelper implements ApiHelper {


    private final static String TAG = AppApiHelper.class.getSimpleName();
    @Inject
    Context context;
    @Inject
    ApiRequests apiRequests;


    @Inject
    public AppApiHelper() {

    }


    @Override
    public Single<SevenDays> CallDays(String VerificationCode, String MerchantsID) {
        return apiRequests.CallDays(VerificationCode, MerchantsID);
    }

    @Override
    public Single<Country> getCountry() {
        return apiRequests.getCountry();
    }

    @Override
    public Single<MyCity> getMyCity(String CountryID) {
        return apiRequests.getMyCity(CountryID);
    }

    @Override
    public Single<User> signUpUser(String Email, String Password, String UserName, String Describtion, String Phone) {
        return apiRequests.signUpUser(Email, Password, UserName, Describtion, Phone);
    }

    @Override
    public Single<Task> getCity(String alt) {
        return apiRequests.getCity(alt);
    }
}
