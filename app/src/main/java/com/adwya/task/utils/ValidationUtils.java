package com.adwya.task.utils;

import android.text.TextUtils;
import android.util.Patterns;
import android.widget.EditText;

import com.adwya.task.R;


/**
 * Created by Aya Mohamed on 11/14/2019.
 */
public final class ValidationUtils {

    /**
     *
     * @param mResourceProvider
     * @param
     * @return
     */
//    public static boolean phoneValidation(ResourceProvider mResourceProvider, EditText phone) {
//        if (TextUtils.isEmpty(phone.getText().toString())) {
//            phone.setError(mResourceProvider.getString(R.string.empty_phone));
//            return false;
//        }
////        if (phone.getText().toString().length()<13) {
////            phone.setError(mResourceProvider.getString(R.string.invalid_phone));
////            return false;
////        }
//        return true;
//    }
//
//    /**
//     *
//     * @param mResourceProvider
//     * @param pwd
//     * @return
//     */
//    public static boolean pwdValidation(ResourceProvider mResourceProvider, EditText pwd) {
//        if (TextUtils.isEmpty(pwd.getText().toString())) {
//            pwd.setError(mResourceProvider.getString(R.string.empty_pwd));
//            return false;
//        }
//        if (!pwd.getText().toString().matches(AppConstants.PWD_PATTERN)) {
//            pwd.setError(mResourceProvider.getString(R.string.password_lenght));
//            return false;
//        }
//        return true;
//    }
//
//    /**
//     *
//     * @param mResourceProvider
//     * @param email
//     * @return
//     */



//    public static boolean emailValidation(ResourceProvider mResourceProvider, EditText email) {
//        if (TextUtils.isEmpty(email.getText().toString())) {
//            email.setError(mResourceProvider.getString(R.string.empty_email));
//            return false;
//        }
//        if (!Patterns.EMAIL_ADDRESS.matcher(email.getText().toString()).matches()) {
//            email.setError(mResourceProvider.getString(R.string.invalid_email));
//            return false;
//        }
//        return true;
//    }
//
//    /**
//     *
//     * @param mResourceProvider
//     * @param text
//     * @return
//     */
//    public static boolean emptyValidation(ResourceProvider mResourceProvider, EditText text) {
//        if (TextUtils.isEmpty(text.getText().toString())) {
//            text.setError(mResourceProvider.getString(R.string.empty_field));
//            return false;
//        }
//        return true;
//    }
//

//
//    public static boolean checkNiceFullName(ResourceProvider mResourceProvider, EditText text) {
//
//        if(TextUtils.isEmpty(text.getText().toString())){
//            text.setError(mResourceProvider.getString(R.string.empty_field));
//            return false;
//        }else {
//            for(int i= 0;i<text.getText().length();i++) {
//                char c = text.getText().charAt(i);
//                if (c >= '0' && c <= '9') {
//                    text.setError(mResourceProvider.getString(R.string.invalid_name_num));
//                    return false;
//                }
//            }
//            return true;
//        }
//    }
//
//    public static boolean fullNameSizeValidation(ResourceProvider mResourceProvider, EditText text) {
//        if (text.getText().toString().length()<2) {
//            text.setError(mResourceProvider.getString(R.string.invalid_name_num_less));
//            return false;
//        }else if(text.getText().toString().length()>20){
//            text.setError(mResourceProvider.getString(R.string.invalid_name_num_more));
//            return false;
//        }
//        return true;
//    }
//
//    public static boolean ConfirmPasword(ResourceProvider mResourceProvider, EditText text,EditText text2) {
//        if (text.getText().toString().equals(text2.getText().toString())) {
//            return true;
//        }else {
//            text.setError(mResourceProvider.getString(R.string.password_confirm));
//
//            return false;
//        }
//    }
}
