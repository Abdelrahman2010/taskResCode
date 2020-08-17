package com.adwya.task.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by Aya Mohamed on 11/14/2019.
 * this class use to provide resources in viewModel
 * to avoid using context in this class because it's a bad practice :D
 */
@Singleton
public class ResourceProvider {

    private Context mContext;

    @Inject
    public ResourceProvider(Context mContext) {
        this.mContext = mContext;
    }

    public String getString(int resId) {
        return mContext.getResources().getString(resId);
    }

    public String getString(int resId, String value) {
        return mContext.getResources().getString(resId, value);
    }

    public Resources getResources() {
        return mContext.getResources();
    }

    public Drawable getDrawable(int resId){ return mContext.getResources().getDrawable(resId);}

}
