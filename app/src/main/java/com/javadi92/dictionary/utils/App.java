package com.javadi92.dictionary.utils;

import android.app.Application;
import android.content.SharedPreferences;

import com.javadi92.dictionary.database.DBHelper;

public class App extends Application {

    public static DBHelper dbHelper;
    public static SharedPreferences sharedPreferences;

    @Override
    public void onCreate() {
        super.onCreate();
        dbHelper=DBHelper.getInstance(this);
        sharedPreferences=this.getSharedPreferences("settings",MODE_PRIVATE);
    }

}
