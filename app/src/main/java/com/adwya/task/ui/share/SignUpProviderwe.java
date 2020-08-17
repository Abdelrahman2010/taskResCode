package com.adwya.task.ui.share;


import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class SignUpProviderwe {

    @ContributesAndroidInjector
    abstract ShareFragment provideShareFragmentFactory();
}
