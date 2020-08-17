package com.adwya.task.di.builder;



import com.adwya.task.MainActivity;
import com.adwya.task.ui.auth.signup.SignUpActivity;
import com.adwya.task.ui.gallery.NotificationProvider;
import com.adwya.task.ui.map.MapsActivity;
import com.adwya.task.ui.send.CurrentLocationProvider;
import com.adwya.task.ui.share.SignUpProviderwe;
import com.adwya.task.ui.tools.SevedDayToolsProvider;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuilder {

    @ContributesAndroidInjector
    abstract SignUpActivity bindSignup();
//
    @ContributesAndroidInjector
    abstract MapsActivity bindMap();
//
//    @ContributesAndroidInjector
//    abstract LoginActivity bindLogin();
//
//    @ContributesAndroidInjector
//    abstract ForgitPassword bindForgit();
//
    @ContributesAndroidInjector(modules = {NotificationProvider.class, CurrentLocationProvider.class, SevedDayToolsProvider.class
    , SignUpProviderwe.class})
    abstract MainActivity bindMainActvity();
}
