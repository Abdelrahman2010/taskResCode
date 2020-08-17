package com.adwya.task.ui.send;


import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class CurrentLocationProvider {

    @ContributesAndroidInjector
    abstract SendFragment provideSendFragmentFactory();
}
