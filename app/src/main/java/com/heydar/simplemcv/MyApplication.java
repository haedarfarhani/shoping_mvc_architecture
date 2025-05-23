package com.heydar.simplemcv;

import android.app.Application;
import android.content.Context;

import com.heydar.simplemcv.model.database.AppDatabase;

public class MyApplication extends Application {
    public static AppDatabase appDatabase;
    private static MyApplication instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        appDatabase = AppDatabase.Companion.getDatabase(this);
    }

    public static Context getContext() {
        return instance.getApplicationContext();
    }

}
