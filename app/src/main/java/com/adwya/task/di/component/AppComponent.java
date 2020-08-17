package com.adwya.task.di.component;

import android.app.Application;

import com.adwya.task.constans.AppController;
import com.adwya.task.di.builder.ActivityBuilder;
import com.adwya.task.di.module.AppModule;

import javax.inject.Singleton;


import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;

/**
 * created by Abdelrahman on 8/2/2018.
 */

@Singleton
@Component(modules = {AndroidInjectionModule.class,
        AppModule.class, ActivityBuilder.class})
public interface AppComponent {

    void inject(AppController app);

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder application(Application application);

        AppComponent build();
    }
}
