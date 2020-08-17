package com.adwya.task.ui.gallery;

import androidx.databinding.ObservableField;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.adwya.task.data.DataManager;
import com.adwya.task.ui.base.BaseNavigator;
import com.adwya.task.ui.base.BaseViewModel;
import com.adwya.task.utils.ResourceProvider;
import com.adwya.task.utils.rx.SchedulerProvider;

public class GalleryViewModel  extends BaseViewModel<BaseNavigator.ShowAlert> {


    public static ObservableField<String> notify_count = new ObservableField<>("2");

    public GalleryViewModel(DataManager dataManager, SchedulerProvider schedulerProvider, ResourceProvider mResourceProvider) {
        super(dataManager, schedulerProvider, mResourceProvider);
    }


}