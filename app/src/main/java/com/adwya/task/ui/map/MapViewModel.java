package com.adwya.task.ui.map;

import android.util.Log;

import com.adwya.task.data.DataManager;
import com.adwya.task.ui.base.BaseNavigator;
import com.adwya.task.ui.base.BaseViewModel;
import com.adwya.task.utils.AppConstants;
import com.adwya.task.utils.ResourceProvider;
import com.adwya.task.utils.rx.SchedulerProvider;

import static com.adwya.task.utils.LogUtils.LOGD;
import static com.adwya.task.utils.LogUtils.LOGE;

public class MapViewModel extends BaseViewModel<MapNavigation> {
    public MapViewModel(DataManager dataManager, SchedulerProvider schedulerProvider, ResourceProvider mResourceProvider) {
        super(dataManager, schedulerProvider, mResourceProvider);
    }


    public void getCity() {
        //if is valid data call api
//        getNavigator().doHideKeyboard();
        getCompositeDisposable().add(getDataManager().getCity( "json")
                .subscribeOn(getSchedulerProvider().io())
                .observeOn(getSchedulerProvider().ui())
                .doOnSubscribe(s -> setIsLoading(true))
                .doAfterTerminate(() -> setIsLoading(false))
                .subscribe(
                        task -> {

                            getNavigator().getCitys(task.getFeed().getEntry());

                        }, throwable -> {
                            LOGE("ERROR:" + throwable.getMessage());
                            Log.d("signUpPP", throwable.getMessage());
                            getNavigator().showAlertDialog(throwable.getMessage(), AppConstants.NOCONNECTION);

                        }
                ));

    }
}
