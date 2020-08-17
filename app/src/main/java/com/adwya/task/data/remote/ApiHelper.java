package com.adwya.task.data.remote;

import com.adwya.task.data.model.Country;
import com.adwya.task.data.model.MyCity;
import com.adwya.task.data.model.SevenDays;
import com.adwya.task.data.model.Task;
import com.adwya.task.data.model.User;

import java.util.HashMap;


import io.reactivex.Single;
import retrofit2.http.Query;

public interface ApiHelper {

    Single<SevenDays>CallDays(String VerificationCode, String MerchantsID);

    Single<Country>getCountry();

    Single<MyCity>getMyCity(String CountryID);

    Single<User>signUpUser(String Email,String Password, String UserName,String Describtion,String Phone);

    Single<Task>getCity(String alt);


}
