package com.adwya.task.ui.base;

import androidx.databinding.ObservableBoolean;
import androidx.lifecycle.ViewModel;

import com.adwya.task.data.DataManager;
import com.adwya.task.utils.ResourceProvider;
import com.adwya.task.utils.rx.SchedulerProvider;

import java.lang.ref.WeakReference;


import io.reactivex.disposables.CompositeDisposable;

/**
 * Created by Abdelrahman mohamed on 08/02/18.
 */

public abstract class BaseViewModel<N> extends ViewModel {

    private final DataManager mDataManager;

    private final SchedulerProvider mSchedulerProvider;

    private final ResourceProvider mResourceProvider;

    private CompositeDisposable mCompositeDisposable;

    private WeakReference<N> mNavigator;

    private final ObservableBoolean mIsLoading = new ObservableBoolean(false);

    public BaseViewModel(DataManager dataManager, SchedulerProvider schedulerProvider, ResourceProvider mResourceProvider){
        this.mDataManager = dataManager;
        this.mSchedulerProvider = schedulerProvider;
        this.mResourceProvider = mResourceProvider;
        this.mCompositeDisposable = new CompositeDisposable();
    }

    @Override
    protected void onCleared() {
        mCompositeDisposable.dispose();
        super.onCleared();
    }

    public N getNavigator(){
        return mNavigator.get();
    }

    public void setNavigator(N navigator) {
        this.mNavigator = new WeakReference<>(navigator);
    }

    public CompositeDisposable getCompositeDisposable() {
        return mCompositeDisposable;
    }

    public SchedulerProvider getSchedulerProvider() {
        return mSchedulerProvider;
    }

    public DataManager getDataManager() {
        return mDataManager;
    }

    public ResourceProvider getResourceProvider() {
        return mResourceProvider;
    }

    public ObservableBoolean getIsLoading() {
        return mIsLoading;
    }

    public void setIsLoading(boolean isLoading) {
        mIsLoading.set(isLoading);
    }

    public String getCurrentLang() {
        return getDataManager().getLang();
    }
}
