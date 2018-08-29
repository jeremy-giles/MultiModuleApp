package com.project.jeremyg.multimoduledagger;

import android.app.Activity;

import com.project.jeremyg.core.BaseApp;
import com.project.jeremyg.multimoduledagger.di.AppComponent;
import com.project.jeremyg.multimoduledagger.di.DaggerAppComponent;
import com.project.jeremyg.multimoduledagger.ui.manager.RepoManager;

import javax.inject.Inject;

import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;

/**
 * Created by JeremyG on 25.07.2018.
 */

public class MyApp extends BaseApp implements HasActivityInjector {

    @Inject
    DispatchingAndroidInjector<Activity> dispatchingAndroidInjector;

    public static MyApp myAppInstance;
    public AppComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        this.initDagger();

        myAppInstance = this;

        useRepoManager();
    }

    @Override
    public DispatchingAndroidInjector<Activity> activityInjector() {
        return dispatchingAndroidInjector;
    }

    private void initDagger() {

        component = DaggerAppComponent.builder()
                .baseContext(baseApplicationContext)
                .build();
        component.inject(this);
    }

    public static MyApp getMyAppInstance() {
        return myAppInstance;
    }

    public static void useRepoManager() {
        new RepoManager().useGithubRepository();
    }
}
