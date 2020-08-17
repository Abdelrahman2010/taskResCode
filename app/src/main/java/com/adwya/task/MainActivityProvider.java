package com.adwya.task;


import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module

public abstract class MainActivityProvider {


    @ContributesAndroidInjector
    abstract MainActivity provideSearchFragmentFactory();

}
