package com.adwya.task.ui.tools;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.adwya.task.data.DataManager;
import com.adwya.task.ui.base.BaseNavigator;
import com.adwya.task.ui.base.BaseViewModel;
import com.adwya.task.utils.AppConstants;
import com.adwya.task.utils.ResourceProvider;
import com.adwya.task.utils.rx.SchedulerProvider;

public class ToolsViewModel extends BaseViewModel<SevenNavigator> {


    public ToolsViewModel(DataManager dataManager, SchedulerProvider schedulerProvider, ResourceProvider mResourceProvider) {
        super(dataManager, schedulerProvider, mResourceProvider);

        CallDays();
    }


    public void CallDays() {

        getCompositeDisposable().add(getDataManager().CallDays("hc6yy233few3eqaa","60007")
                .subscribeOn(getSchedulerProvider().io())
                .observeOn(getSchedulerProvider().ui())
                .doOnSubscribe(s -> setIsLoading(true))
                .doAfterTerminate(() -> setIsLoading(false))
                .subscribe(
                        sevenDays -> {

                            getNavigator().getSevenCat(sevenDays.getmData());

                        }, throwable -> {
                            getNavigator().showAlertDialog(throwable.getMessage(), AppConstants.NOCONNECTION);

                        }
                ));
        //    }
    }
}