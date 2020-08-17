package com.adwya.task.utils;

/**
 * Created by aya mohamed on 11/12/19.
 */


public final class AppConstants {

    public static final String FILE_NAME = "video_";
    public static final String PREF_NAME = "app_prefs";
    public static final String STRING_NULL_INDEX = "null";
    public static final boolean BOOLEAN_NULL_INDEX = false;
    public static final String EN = "en";
    public static final String AR = "ar";
    //public static final String PWD_PATTERN = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,}";
    public static final String PWD_PATTERN = "().{8,}";
    public static final String PHONE_PATTERN = "\\d{11}|(?:\\d{3}-){2}\\d{4}|\\(\\d{3}\\)\\d{3}-?\\d{4}";
    public static final String SUCCESS_MESSAGE = "success_msg";
    public static final String ERROR_MESSAGE = "error_msg";
    public static final String CART = "CART";
    public static final String FORGET_PWD = "forget_pwd";
    public static final String GUEST = "guest";
    public static final String LOGIN = "login";
    public static final String REGISTER = "register";
    public static final String DEFAULT_IMAGE = "https://i.ibb.co/5nPSYgf/index.png";
    public static final String DEFAULT_CAT_ID = "-1";
    public static final int REQUEST_COUNTRY = 11;
    public static final int REQUEST_CITY = 12;
    public static final int REQUEST_IMAGE = 13;
    public static final String IMAGE_BASE64 = "image_base64";
    public static final String IMAGE_URI = "image_uri";
    public static final String RESULT = "name";
    public static final String RESULT_ID = "id";
    public static final String RESULT_CODE = "code";
    public static final String RESULT_FLAG = "flag";
    public static final String IMAGE_BITMAP = "image_bitmap";
    public static final String RE_LOGIN = "re_login";
    public static final String LOGGED_OUT = "logged_out";
    public static final String CHANGE_PASSWORD = "change_Password";
    public static final String VIDEO_DURATION = "30";
    public static final String NOCONNECTION = "NOCon";

    private AppConstants() {
        // This utility class is not publicly instantiable
    }
}