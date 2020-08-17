package com.adwya.task.data.prefs;

import android.content.Context;
import android.content.SharedPreferences;

import com.adwya.task.data.DataManager;
import com.adwya.task.di.PreferenceInfo;
import com.adwya.task.utils.AppConstants;

import javax.inject.Inject;



public class AppPreferencesHelper implements PreferencesHelper {


  private final SharedPreferences mPrefs;
  private final String KEY_IS_LANG_SELECTED = "is_lang_selected";
  private final String PREF_KEY_USER_LOGGED_IN_MODE = "user_type";
  private final String KEY_DEVICE_ID = "device_id";
  private final String PREF_KEY_TOKEN = "token";
  private final String PREF_KEY_USER_TYPE = "membership_type";
  private final String PREF_KEY_LANG = "lang";
  private final String PREF_KEY_FCM_TOKEN = "fcm_token";
  private final String PREF_KEY_PHONE = "phone";
  private final String PREF_KEY_PWD = "pwd";
  private final String PREF_KEY_ON_BOARDING_VISIBLE = "on_boarding_is_visible";
  private final String PREF_KEY_IS_REMEMBER_ME = "is_remember_me";
  private final String PREF_KEY_NAME = "user_name";
  private final String PREF_KEY_EMAIL = "email";
  private final String PREF_KEY_IMAGE = "image";
  private final String PREF_KEY_PHONE_NUMBER = "phone_number";
  private final String PREF_KEY_COUNTRY_TEXT = "country";
  private final String PREF_KEY_COUNTRY_ID = "country_id";
  private final String PREF_KEY_CITY_TEXT = "city";
  private final String PREF_KEY_CITY_ID = "city_id";
  private final String PREF_KEY_USER_ID = "user_id";
  private final String PREF_KEY_VALID = "valid";
  private final String PREF_KEY_RATE  = "rate";



  @Inject
  public AppPreferencesHelper(Context context, @PreferenceInfo String prefFileName) {
    mPrefs = context.getSharedPreferences(prefFileName, Context.MODE_PRIVATE);
  }

  @Override
  public void setDeviceID(String device_id) {
    mPrefs.edit().putString(KEY_DEVICE_ID, device_id).apply();
  }

  @Override
  public String getDeviceID() {
    String deviceId = mPrefs.getString(KEY_DEVICE_ID, AppConstants.STRING_NULL_INDEX);
    return deviceId;
  }

  @Override
  public void setOnBoardingVisible(boolean isVisible) {
    mPrefs.edit().putBoolean(PREF_KEY_ON_BOARDING_VISIBLE, isVisible).apply();
  }

  @Override
  public boolean getOnBoardingVisible() {
    boolean onBoardingVisible = mPrefs.getBoolean(PREF_KEY_ON_BOARDING_VISIBLE, AppConstants.BOOLEAN_NULL_INDEX);
    return onBoardingVisible;
  }

  @Override
  public void setIsLangSelected(boolean isLangSelected) {
    mPrefs.edit().putBoolean(KEY_IS_LANG_SELECTED, isLangSelected).apply();
  }

  @Override
  public boolean getIsLangSelected() {
    boolean isLangSelected = mPrefs.getBoolean(KEY_IS_LANG_SELECTED, AppConstants.BOOLEAN_NULL_INDEX);
    return isLangSelected;
  }

  @Override
  public void setLang(String lang) {
    mPrefs.edit().putString(PREF_KEY_LANG, lang).apply();;
  }

  @Override
  public String getLang() {
    String lang = mPrefs.getString(PREF_KEY_LANG, AppConstants.STRING_NULL_INDEX);
    return lang;
  }

  @Override
  public int getCurrentUserLoggedInMode() {
    return mPrefs.getInt(PREF_KEY_USER_LOGGED_IN_MODE,
            DataManager.LoggedInMode.LOGGED_IN_MODE_LOGGED_OUT.getType());
  }

  @Override
  public void setCurrentUserLoggedInMode(DataManager.LoggedInMode mode) {
    mPrefs.edit().putInt(PREF_KEY_USER_LOGGED_IN_MODE, mode.getType()).apply();
  }

  @Override
  public void setToken(String token) {
    mPrefs.edit().putString(PREF_KEY_TOKEN, token).apply();
  }

  @Override
  public String getToken() {
    String token = mPrefs.getString(PREF_KEY_TOKEN, AppConstants.STRING_NULL_INDEX);
    return mPrefs.getString(PREF_KEY_TOKEN, token);
  }

  @Override
  public void setUserType(String type) {
    mPrefs.edit().putString(PREF_KEY_USER_TYPE, type).apply();
  }

  @Override
  public String getUserType() {
    String type = mPrefs.getString(PREF_KEY_USER_TYPE, AppConstants.STRING_NULL_INDEX);
    return mPrefs.getString(PREF_KEY_USER_TYPE, type);
  }

  @Override
  public void logOut() {
    mPrefs.edit().remove(PREF_KEY_TOKEN).apply();
    mPrefs.edit().remove(PREF_KEY_USER_TYPE).apply();
    mPrefs.edit().remove(PREF_KEY_NAME).apply();
    mPrefs.edit().remove(PREF_KEY_EMAIL).apply();
    mPrefs.edit().remove(PREF_KEY_IMAGE).apply();
    mPrefs.edit().remove(PREF_KEY_PHONE_NUMBER).apply();
    mPrefs.edit().remove(PREF_KEY_COUNTRY_TEXT).apply();
    mPrefs.edit().remove(PREF_KEY_COUNTRY_ID).apply();
    mPrefs.edit().remove(PREF_KEY_CITY_TEXT).apply();
    mPrefs.edit().remove(PREF_KEY_CITY_ID).apply();
    mPrefs.edit().remove(PREF_KEY_USER_ID).apply();
    mPrefs.edit().remove(PREF_KEY_VALID).apply();
    mPrefs.edit().putInt(PREF_KEY_USER_LOGGED_IN_MODE, DataManager.LoggedInMode.LOGGED_IN_MODE_LOGGED_OUT.getType()).apply();
  }

  @Override
  public void setPhone(String phone) {
    mPrefs.edit().putString(PREF_KEY_PHONE, phone).apply();
  }

  @Override
  public String getPhone() {
    String phone = mPrefs.getString(PREF_KEY_PHONE, AppConstants.STRING_NULL_INDEX);
    return mPrefs.getString(PREF_KEY_PHONE, phone);
  }

  @Override
  public void setPwd(String pwd) {
    mPrefs.edit().putString(PREF_KEY_PWD, pwd).apply();
  }

  @Override
  public String getPwd() {
    String pwd = mPrefs.getString(PREF_KEY_PWD, AppConstants.STRING_NULL_INDEX);
    return mPrefs.getString(PREF_KEY_PWD, pwd);
  }

  @Override
  public void setIsRememberMe(boolean isRememberMe) {
    mPrefs.edit().putBoolean(PREF_KEY_IS_REMEMBER_ME, isRememberMe).apply();
  }

  @Override
  public boolean getIsRememberMe() {
    boolean isRememberMe = mPrefs.getBoolean(PREF_KEY_IS_REMEMBER_ME, AppConstants.BOOLEAN_NULL_INDEX);
    return mPrefs.getBoolean(PREF_KEY_IS_REMEMBER_ME, isRememberMe);
  }

  @Override
  public void setImage(String image) {
    mPrefs.edit().putString(PREF_KEY_IMAGE, image).apply();
  }

  @Override
  public String getImage() {
    String image = mPrefs.getString(PREF_KEY_IMAGE, AppConstants.STRING_NULL_INDEX);
    return mPrefs.getString(PREF_KEY_IMAGE, image);
  }

  @Override
  public void setEmail(String email) {
    mPrefs.edit().putString(PREF_KEY_EMAIL, email).apply();
  }

  @Override
  public String getEmail() {
    String email = mPrefs.getString(PREF_KEY_EMAIL, AppConstants.STRING_NULL_INDEX);
    return mPrefs.getString(PREF_KEY_EMAIL, email);
  }

  @Override
  public void setName(String name) {
    mPrefs.edit().putString(PREF_KEY_NAME, name).apply();
  }

  @Override
  public String getName() {
    String name = mPrefs.getString(PREF_KEY_NAME, AppConstants.STRING_NULL_INDEX);
    return mPrefs.getString(PREF_KEY_NAME, name);
  }

  @Override
  public void setPhoneNumber(String phoneNumber) {
    mPrefs.edit().putString(PREF_KEY_PHONE_NUMBER, phoneNumber).apply();
  }

  @Override
  public String getPhoneNumber() {
    String phoneNumber = mPrefs.getString(PREF_KEY_PHONE_NUMBER, AppConstants.STRING_NULL_INDEX);
    return mPrefs.getString(PREF_KEY_PHONE_NUMBER, phoneNumber);
  }

  @Override
  public void setCountryText(String countryText) {
    mPrefs.edit().putString(PREF_KEY_COUNTRY_TEXT, countryText).apply();
  }

  @Override
  public String getCountryText() {
    String countryText = mPrefs.getString(PREF_KEY_COUNTRY_TEXT, AppConstants.STRING_NULL_INDEX);
    return mPrefs.getString(PREF_KEY_COUNTRY_TEXT, countryText);
  }

  @Override
  public void setCityText(String cityText) {
    mPrefs.edit().putString(PREF_KEY_CITY_TEXT, cityText).apply();
  }

  @Override
  public String getCityText() {
    String cityText = mPrefs.getString(PREF_KEY_CITY_TEXT, AppConstants.STRING_NULL_INDEX);
    return mPrefs.getString(PREF_KEY_CITY_TEXT, cityText);
  }

  @Override
  public void setCountryId(String countryId) {
    mPrefs.edit().putString(PREF_KEY_COUNTRY_ID, countryId).apply();
  }

  @Override
  public String getCountryId() {
    String countryId = mPrefs.getString(PREF_KEY_COUNTRY_ID, AppConstants.STRING_NULL_INDEX);
    return mPrefs.getString(PREF_KEY_COUNTRY_ID, countryId);
  }

  @Override
  public void setCityId(String cityId) {
    mPrefs.edit().putString(PREF_KEY_CITY_ID, cityId).apply();
  }

  @Override
  public String getCityId() {
    String cityId = mPrefs.getString(PREF_KEY_CITY_ID, AppConstants.STRING_NULL_INDEX);
    return mPrefs.getString(PREF_KEY_CITY_ID, cityId);
  }

  @Override
  public void setUserId(String userId) {
    mPrefs.edit().putString(PREF_KEY_USER_ID, userId).apply();
  }

  @Override
  public String getUserId() {
    String userId = mPrefs.getString(PREF_KEY_USER_ID, AppConstants.STRING_NULL_INDEX);
    return mPrefs.getString(PREF_KEY_USER_ID, userId);
  }

  @Override
  public void setValid(String valid) {
    mPrefs.edit().putString(PREF_KEY_VALID, valid).apply();
  }

  @Override
  public String getValid() {
    String valid = mPrefs.getString(PREF_KEY_VALID, AppConstants.STRING_NULL_INDEX);
    return mPrefs.getString(PREF_KEY_VALID, valid);
  }

  @Override
  public void setMyRate(float rate) {

        mPrefs.edit().putString(PREF_KEY_RATE, String.valueOf(rate)).apply();
  }

  @Override
  public String getRate() {
    String userId = mPrefs.getString(PREF_KEY_RATE, AppConstants.STRING_NULL_INDEX);
    return mPrefs.getString(PREF_KEY_RATE, userId);
  }
}
