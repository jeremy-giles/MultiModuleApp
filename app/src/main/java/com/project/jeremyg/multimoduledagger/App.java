package com.project.jeremyg.multimoduledagger;

import android.app.Activity;

import com.project.jeremyg.architecture.di.ArchitectureComponent;
import com.project.jeremyg.architecture.di.DaggerArchitectureComponent;
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

    public ArchitectureComponent architectureComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        this.initDagger();
    }

    @Override
    public DispatchingAndroidInjector<Activity> activityInjector() {
        return dispatchingAndroidInjector;
    }

    private void initDagger() {

        architectureComponent = DaggerArchitectureComponent.builder().build();

        DaggerAppComponent.builder()
                .baseContext(baseApplicationContext)
                .architectureComponent(architectureComponent)
                .build().inject(this);
    }
}
