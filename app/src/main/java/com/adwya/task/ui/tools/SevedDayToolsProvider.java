package com.adwya.task.ui.tools;


import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class SevedDayToolsProvider {

    @ContributesAndroidInjector
    abstract ToolsFragment provideToolsFragmentFactory();
}
