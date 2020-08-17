package com.adwya.task.ui.gallery;


import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class NotificationProvider {

    @ContributesAndroidInjector
    abstract GalleryFragment provideSearchFragmentFactory();

}
