package com.project.jeremyg.core;

import android.app.Application;
import android.content.Context;

/**
 * Created by JeremyG on 25.07.2018.
 */

public class BaseApp extends Application {

    public Context baseApplicationContext;

    @Override
    public void onCreate() {
        super.onCreate();
        baseApplicationContext = getApplicationContext();
    }

}
