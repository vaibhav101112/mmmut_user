package com.vaibhavguptammmut.mmmut;

import android.app.Application;

import com.onesignal.OneSignal;

public class CollegeApp extends Application {

    private static final String ONESIGNAL_APP_ID = "5103e915-2144-4249-a94c-e781b8c9ea77";
    @Override
    public void onCreate() {
        super.onCreate();

        OneSignal.initWithContext(this);
        OneSignal.setAppId(ONESIGNAL_APP_ID);
    }
}
