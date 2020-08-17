package com.adwya.task.ui.share;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.adwya.task.data.DataManager;
import com.adwya.task.ui.base.BaseViewModel;
import com.adwya.task.utils.AppConstants;
import com.adwya.task.utils.ResourceProvider;
import com.adwya.task.utils.rx.SchedulerProvider;

public class ShareViewModel  extends BaseViewModel<SignUpNavigator> {


    public ShareViewModel(DataManager dataManager, SchedulerProvider schedulerProvider, ResourceProvider mResourceProvider) {
        super(dataManager, schedulerProvider, mResourceProvider);

        getCountry();
    }


    public void getCountry() {

        getCompositeDisposable().add(getDataManager().getCountry()
                .subscribeOn(getSchedulerProvider().io())
                .observeOn(getSchedulerProvider().ui())
                .doOnSubscribe(s -> setIsLoading(true))
                .doAfterTerminate(() -> setIsLoading(false))
                .subscribe(
                        country -> {

                            getNavigator().getCountries(country.getmData());

                        }, throwable -> {
                            getNavigator().showAlertDialog(throwable.getMessage(), AppConstants.NOCONNECTION);

                        }
                ));
        //    }
    }

    public void getMyCity(String CountryID) {

        getCompositeDisposable().add(getDataManager().getMyCity(CountryID)
                .subscribeOn(getSchedulerProvider().io())
                .observeOn(getSchedulerProvider().ui())
                .doOnSubscribe(s -> setIsLoading(true))
                .doAfterTerminate(() -> setIsLoading(false))
                .subscribe(
                        myCity -> {

                            getNavigator().getMyCity(myCity.getmData());

                        }, throwable -> {
                            getNavigator().showAlertDialog(throwable.getMessage(), AppConstants.NOCONNECTION);

                        }
                ));
        //    }
    }
}