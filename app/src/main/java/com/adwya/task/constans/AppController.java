package com.adwya.task.constans;


import android.app.Activity;

import androidx.multidex.MultiDexApplication;

import com.adwya.task.di.component.DaggerAppComponent;
import com.adwya.task.utils.ResourceProvider;
import com.bumptech.glide.Glide;

import javax.inject.Inject;


import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;


public final class AppController extends MultiDexApplication implements HasActivityInjector {


  @Inject
  DispatchingAndroidInjector<Activity> activityDispatchingAndroidInjector;

  private static final String TAG = AppController.class.getSimpleName();
  private static AppController controller;

  // Resource Provider
  private ResourceProvider mResourceProvider;

  public ResourceProvider getResourceProvider() {
    if (mResourceProvider == null)
      mResourceProvider = new ResourceProvider(this);

    return mResourceProvider;
  }

  @Override
  public void onCreate() {
    super.onCreate();

    DaggerAppComponent.builder()
            .application(this)
            .build()
            .inject(this);

    controller = this;

  }


  @Override
  public void onTrimMemory(int level) {
    super.onTrimMemory(level);
    Glide.get(this).trimMemory(level);
  }

  public static AppController getInstance() {
    return controller;
  }

  @Override
  public AndroidInjector<Activity> activityInjector() {
    return activityDispatchingAndroidInjector;
  }


}
