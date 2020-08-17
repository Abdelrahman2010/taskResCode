package com.adwya.task.data;


import com.adwya.task.data.prefs.PreferencesHelper;
import com.adwya.task.data.remote.ApiHelper;

public interface DataManager extends PreferencesHelper, ApiHelper {

    enum LoggedInMode {

        LOGGED_IN_MODE_LOGGED_OUT(0),
        LOGGED_IN_MODE_LOGGED_IN(1);

        private final int mType;

        LoggedInMode(int mType) {
            this.mType = mType;
        }

        public int getType() {
            return mType;
        }

    }

}
