package com.adwya.task.ui.map;

import com.adwya.task.ui.send.SendFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;


@Module
public abstract class MapProvider {


    @ContributesAndroidInjector
    abstract MapsActivity provideMapsActivityFactory();
}
