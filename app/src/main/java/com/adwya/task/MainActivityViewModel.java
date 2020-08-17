package com.adwya.task;

import com.adwya.task.data.DataManager;
import com.adwya.task.ui.base.BaseNavigator;
import com.adwya.task.ui.base.BaseViewModel;
import com.adwya.task.utils.ResourceProvider;
import com.adwya.task.utils.rx.SchedulerProvider;

public class MainActivityViewModel extends BaseViewModel<BaseNavigator.ShowAlert> {
    public MainActivityViewModel(DataManager dataManager, SchedulerProvider schedulerProvider, ResourceProvider mResourceProvider) {
        super(dataManager, schedulerProvider, mResourceProvider);
    }
}
