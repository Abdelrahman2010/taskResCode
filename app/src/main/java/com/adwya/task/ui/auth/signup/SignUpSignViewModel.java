package com.adwya.task.ui.auth.signup;


import android.util.Log;

import com.adwya.task.data.DataManager;
import com.adwya.task.data.model.ApiRoot;
import com.adwya.task.ui.base.BaseNavigator;
import com.adwya.task.ui.base.BaseViewModel;
import com.adwya.task.utils.AppConstants;
import com.adwya.task.utils.ResourceProvider;
import com.adwya.task.utils.rx.SchedulerProvider;

import static com.adwya.task.utils.LogUtils.LOGD;
import static com.adwya.task.utils.LogUtils.LOGE;

public  class SignUpSignViewModel extends BaseViewModel<SignUpNavigator> {


    public SignUpSignViewModel(DataManager dataManager, SchedulerProvider schedulerProvider, ResourceProvider mResourceProvider) {
        super(dataManager, schedulerProvider, mResourceProvider);
    }


    public void signUpUser(String Email,String Password, String UserName,String Describtion,String Phone) {
        //if is valid data call api
//        getNavigator().doHideKeyboard();
        getCompositeDisposable().add(getDataManager().signUpUser( Email, Password,  UserName, Describtion, Phone)
                .subscribeOn(getSchedulerProvider().io())
                .observeOn(getSchedulerProvider().ui())
                .doOnSubscribe(s -> setIsLoading(true))
                .doAfterTerminate(() -> setIsLoading(false))
                .subscribe(
                        user -> {
                            if (user.getSuccess()) {
                                LOGD("SUCCESS");
                                // save user token
//                                getDataManager().setToken(user.getData().getmToken());
//                                getDataManager().setCurrentUserLoggedInMode(DataManager.LoggedInMode.LOGGED_IN_MODE_LOGGED_IN);
//                                getDataManager().setToken(user.getData().getmToken());
//                                getDataManager().setPhoneNumber(user.getData().getPhone_number());
//                                getDataManager().setName(user.getData().getFirst_name() + " " + user.getData().getLast_name());
//                                getDataManager().setImage(user.getData().getImage());
//                                getDataManager().setEmail(user.getData().getEmail());
//                                getDataManager().setUserId(user.getData().getId());
//                                getDataManager().setValid(user.getData().getValid());
//                                getDataManager().setCurrentUserLoggedInMode(DataManager.LoggedInMode.LOGGED_IN_MODE_LOGGED_IN);

                                   getNavigator().goToHome();
                                //   getNavigator().showAlertDialog(user.getMessage(), AppConstants.REGISTER);


                                Log.d("signUpPP", user.getMessage());
                            } else {
                                LOGE("ERROR");
                                getNavigator().showAlertDialog(user.getMessage(), AppConstants.ERROR_MESSAGE);
                                Log.d("signUpPP", "log fail");
                            }
                        }, throwable -> {
                            LOGE("ERROR:" + throwable.getMessage());
                            Log.d("signUpPP", throwable.getMessage());
                            getNavigator().showAlertDialog(throwable.getMessage(), AppConstants.NOCONNECTION);

                        }
                ));

    }



}
