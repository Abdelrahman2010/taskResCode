package com.adwya.task.data.remote.retrofitrepo;

import com.adwya.task.data.model.Country;
import com.adwya.task.data.model.MyCity;
import com.adwya.task.data.model.SevenDays;
import com.adwya.task.data.model.Task;
import com.adwya.task.data.model.User;
import com.adwya.task.data.remote.ApiEndPoint;

import java.util.HashMap;


import io.reactivex.Single;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiRequests {



    @GET(ApiEndPoint.GETSEVEN)
    Single<SevenDays>CallDays(@Query("VerificationCode") String VerificationCode, @Query("MerchantsID") String MerchantsID);


    @GET("DriverService.asmx/GetCountry")
    Single<Country>getCountry();

    @GET("DriverService.asmx/GetCountry")
    Single<MyCity>getMyCity(@Query("CountryID") String CountryID);


    @POST("SignUpUser.php")
    Single<User>signUpUser(@Query("Email") String Email,@Query("Password") String Password,
                           @Query("UserName") String UserName,@Query("Describtion") String Describtion,
                           @Query("Phone") String Phone);


    @GET("basic")
    Single<Task>getCity(@Query("alt") String alt);





}
