package com.adwya.task.ui.send;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.adwya.task.data.DataManager;
import com.adwya.task.data.model.ApiRoot;
import com.adwya.task.ui.auth.signup.SignUpNavigator;
import com.adwya.task.ui.base.BaseNavigator;
import com.adwya.task.ui.base.BaseViewModel;
import com.adwya.task.utils.AppConstants;
import com.adwya.task.utils.ResourceProvider;
import com.adwya.task.utils.rx.SchedulerProvider;

public class SendViewModel extends BaseViewModel<BaseNavigator.ShowAlert> {


    public SendViewModel(DataManager dataManager, SchedulerProvider schedulerProvider, ResourceProvider mResourceProvider) {
        super(dataManager, schedulerProvider, mResourceProvider);
    }



}