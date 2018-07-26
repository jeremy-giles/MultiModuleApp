package com.project.jeremyg.multimoduledagger;

import android.app.Activity;

import com.project.jeremyg.core.BaseApp;
import com.project.jeremyg.multimoduledagger.di.DaggerAppComponent;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;

/**
 * Created by JeremyG on 25.07.2018.
 */

public class App extends BaseApp implements HasActivityInjector {

    @Inject
    DispatchingAndroidInjector<Activity> dispatchingAndroidInjector;

    @Override
    public void onCreate() {
        super.onCreate();
        this.initDagger();
    }

    @Override
    public AndroidInjector<Activity> activityInjector() {
        return dispatchingAndroidInjector;
    }

    private void initDagger() {
        DaggerAppComponent.builder().baseContext(baseApplicationContext).build().inject(this);
    }
}
