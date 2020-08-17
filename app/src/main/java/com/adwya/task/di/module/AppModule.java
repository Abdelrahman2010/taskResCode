package com.adwya.task.di.module;

import android.app.Application;
import android.content.Context;

import com.adwya.task.BuildConfig;
import com.adwya.task.constans.ViewModelProviderFactory;
import com.adwya.task.data.AppDataManager;
import com.adwya.task.data.DataManager;
import com.adwya.task.data.prefs.AppPreferencesHelper;
import com.adwya.task.data.prefs.PreferencesHelper;
import com.adwya.task.data.remote.ApiHelper;
import com.adwya.task.data.remote.AppApiHelper;
import com.adwya.task.data.remote.retrofitrepo.ApiConstants;
import com.adwya.task.data.remote.retrofitrepo.ApiInterceptor;
import com.adwya.task.data.remote.retrofitrepo.ApiRequests;
import com.adwya.task.di.PreferenceInfo;
import com.adwya.task.utils.AppConstants;
import com.adwya.task.utils.ResourceProvider;
import com.adwya.task.utils.rx.AppSchedulerProvider;
import com.adwya.task.utils.rx.SchedulerProvider;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.concurrent.TimeUnit;

import javax.inject.Singleton;


import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class AppModule {
    @Provides
    @Singleton
    Context provideContext(Application application) {
        return application;
    }

    @Provides
    @PreferenceInfo
    String providePreferenceName() {
        return AppConstants.PREF_NAME;
    }

    @Provides
    @Singleton
    DataManager provideDataManager(AppDataManager appDataManager) {
        return appDataManager;
    }

    @Provides
    @Singleton
    Gson provideGson() {
        return new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
    }

    @Provides
    SchedulerProvider provideSchedulerProvider() {
        return new AppSchedulerProvider();
    }

    @Provides
    @Singleton
    ApiHelper provideApiHelper(AppApiHelper appApiHelper) {
        return appApiHelper;
    }

    @Provides
    @Singleton
    PreferencesHelper providePreferencesHelper(AppPreferencesHelper appPreferencesHelper) {
        return appPreferencesHelper;
    }

    @Provides
    @Singleton
    ResourceProvider provideResourceProvider(Context context) {
        return new ResourceProvider(context);
    }

    @Provides
    @Singleton
    ViewModelProviderFactory provideViewModelProviderFactory(DataManager dataManager, SchedulerProvider schedulerProvider, ResourceProvider resourceProvider) {
        return new ViewModelProviderFactory(dataManager, schedulerProvider, resourceProvider);
    }

    @Provides
    @Singleton
    ApiRequests getApiInterface(Retrofit retroFit) {
        return retroFit.create(ApiRequests.class);
    }

    @Provides
    @Singleton
    Retrofit getRetrofit(OkHttpClient okHttpClient) {
        return new Retrofit.Builder()
                .baseUrl(BuildConfig.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(okHttpClient)
                .build();
    }

    @Provides
    @Singleton
    OkHttpClient getOkHttpClient(HttpLoggingInterceptor httpLoggingInterceptor, ApiInterceptor apiInterceptor) {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.interceptors().add(apiInterceptor);
        builder.connectTimeout(ApiConstants.CONNECT_TIMEOUT, TimeUnit.SECONDS)
                .writeTimeout(ApiConstants.WRITE_TIMEOUT, TimeUnit.SECONDS)
                .readTimeout(ApiConstants.READ_TIMEOUT, TimeUnit.SECONDS)
                .addInterceptor(httpLoggingInterceptor)
                .build();
        return builder.build();
    }

    @Provides
    @Singleton
    HttpLoggingInterceptor getHttpLoggingInterceptor() {
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.HEADERS);
        return httpLoggingInterceptor;
    }

    @Provides
    @Singleton
    ApiInterceptor getApiInterceptor(PreferencesHelper preferencesHelper) {
        return new ApiInterceptor(preferencesHelper);
    }
}
