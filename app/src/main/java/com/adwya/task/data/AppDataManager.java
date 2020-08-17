package com.adwya.task.data;


import android.content.Context;

import com.adwya.task.data.model.Country;
import com.adwya.task.data.model.MyCity;
import com.adwya.task.data.model.SevenDays;
import com.adwya.task.data.model.Task;
import com.adwya.task.data.model.User;
import com.adwya.task.data.prefs.PreferencesHelper;
import com.adwya.task.data.remote.ApiHelper;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.Single;

@Singleton
public class AppDataManager implements DataManager{
    private final PreferencesHelper mPreferencesHelper;
    private final ApiHelper mApiHelper;
    private final Context mContext;

    @Inject
    public AppDataManager(Context context, PreferencesHelper mPreferencesHelper,
                          ApiHelper mApiHelper) {
        this.mPreferencesHelper = mPreferencesHelper;
        this.mApiHelper = mApiHelper;
        this.mContext = context;
    }

    @Override
    public void setDeviceID(String device_id) {
        mPreferencesHelper.setDeviceID(device_id);
    }

    @Override
    public String getDeviceID() {
        return mPreferencesHelper.getDeviceID();
    }

    @Override
    public void setOnBoardingVisible(boolean isVisible) {
        mPreferencesHelper.setOnBoardingVisible(isVisible);
    }

    @Override
    public boolean getOnBoardingVisible() {
        return mPreferencesHelper.getOnBoardingVisible();
    }

    @Override
    public void setIsLangSelected(boolean isLangSelected) {
        mPreferencesHelper.setIsLangSelected(isLangSelected);
    }

    @Override
    public boolean getIsLangSelected() {
        return mPreferencesHelper.getIsLangSelected();
    }

    @Override
    public void setLang(String lang) {
        mPreferencesHelper.setLang(lang);
    }

    @Override
    public String getLang() {
        return mPreferencesHelper.getLang();
    }

    @Override
    public int getCurrentUserLoggedInMode() {
        return mPreferencesHelper.getCurrentUserLoggedInMode();
    }

    @Override
    public void setToken(String token) {

    }

    @Override
    public String getToken() {
        return null;
    }

    @Override
    public void setUserType(String type) {

    }

    @Override
    public String getUserType() {
        return null;
    }

    @Override
    public void logOut() {

    }

    @Override
    public void setPhone(String phone) {

    }

    @Override
    public String getPhone() {
        return null;
    }

    @Override
    public void setPwd(String pwd) {

    }

    @Override
    public String getPwd() {
        return null;
    }

    @Override
    public void setIsRememberMe(boolean isRememberMe) {

    }

    @Override
    public boolean getIsRememberMe() {
        return false;
    }

    @Override
    public void setImage(String image) {

    }

    @Override
    public String getImage() {
        return null;
    }

    @Override
    public void setEmail(String email) {

    }

    @Override
    public String getEmail() {
        return null;
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setPhoneNumber(String phoneNumber) {

    }

    @Override
    public String getPhoneNumber() {
        return null;
    }

    @Override
    public void setCountryText(String countryText) {

    }

    @Override
    public String getCountryText() {
        return null;
    }

    @Override
    public void setCityText(String cityText) {

    }

    @Override
    public String getCityText() {
        return null;
    }

    @Override
    public void setCountryId(String countryId) {

    }

    @Override
    public String getCountryId() {
        return null;
    }

    @Override
    public void setCityId(String cityId) {

    }

    @Override
    public String getCityId() {
        return null;
    }

    @Override
    public void setUserId(String userId) {

    }

    @Override
    public String getUserId() {
        return null;
    }

    @Override
    public void setValid(String valid) {

    }

    @Override
    public String getValid() {
        return null;
    }

    @Override
    public void setMyRate(float rate) {

    }

    @Override
    public String getRate() {
        return null;
    }

    @Override
    public void setCurrentUserLoggedInMode(LoggedInMode mode) {

        mPreferencesHelper.setCurrentUserLoggedInMode(mode);

    }


    @Override
    public Single<SevenDays> CallDays(String VerificationCode, String MerchantsID) {
        return mApiHelper.CallDays( VerificationCode,  MerchantsID);
    }

    @Override
    public Single<Country> getCountry() {
        return mApiHelper.getCountry();
    }

    @Override
    public Single<MyCity> getMyCity(String CountryID) {
        return mApiHelper.getMyCity(CountryID);
    }

    @Override
    public Single<User> signUpUser(String Email, String Password, String UserName, String Describtion, String Phone) {
        return mApiHelper.signUpUser(Email, Password, UserName, Describtion, Phone);
    }

    @Override
    public Single<Task> getCity(String alt) {
        return mApiHelper.getCity(alt);
    }
}
