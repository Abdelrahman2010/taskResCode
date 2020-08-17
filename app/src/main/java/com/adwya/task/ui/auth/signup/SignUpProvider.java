package com.adwya.task.ui.auth.signup;

import com.adwya.task.ui.send.SendFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;


@Module
public abstract class SignUpProvider {

    @ContributesAndroidInjector
    abstract SignUpActivity provideSignUpActivityFactory();
}
