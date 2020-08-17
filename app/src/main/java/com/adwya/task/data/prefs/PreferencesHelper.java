package com.adwya.task.data.prefs;


import com.adwya.task.data.DataManager;

/**
 * Created by aya mohamed on 08/02/18.
 */

public interface PreferencesHelper {

    void setDeviceID(String device_id);
    String getDeviceID();

    void setOnBoardingVisible(boolean isVisible);
    boolean getOnBoardingVisible();

    void setIsLangSelected(boolean isLangSelected);
    boolean getIsLangSelected();

    void setLang(String lang);
    String getLang();

    int getCurrentUserLoggedInMode();
    void setCurrentUserLoggedInMode(DataManager.LoggedInMode mode);

    void setToken(String token);
    String getToken();

    void setUserType(String type);
    String getUserType();

    void logOut();

    void setPhone(String phone);
    String getPhone();

    void setPwd(String pwd);
    String getPwd();

    void setIsRememberMe(boolean isRememberMe);
    boolean getIsRememberMe();

    void setImage(String image);
    String getImage();

    void setEmail(String email);
    String getEmail();

    void setName(String name);
    String getName();

    void setPhoneNumber(String phoneNumber);
    String getPhoneNumber();

    void setCountryText(String countryText);
    String getCountryText();

    void setCityText(String cityText);
    String getCityText();

    void setCountryId(String countryId);
    String getCountryId();

    void setCityId(String cityId);
    String getCityId();

    void setUserId(String userId);
    String getUserId();

    void setValid(String valid);
    String getValid();


    void setMyRate(float rate);

    String getRate();
}
