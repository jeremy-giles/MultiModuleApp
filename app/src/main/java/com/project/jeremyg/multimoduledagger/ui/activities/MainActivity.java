package com.project.jeremyg.multimoduledagger.ui.activities;

import android.os.Bundle;
import android.support.v4.app.Fragment;

import com.project.jeremyg.core.ui.activities.BaseListActivity;
import com.project.jeremyg.multimoduledagger.ui.fragments.RepoListFragment;

import javax.inject.Inject;

import dagger.android.AndroidInjection;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.HasSupportFragmentInjector;

/**
 * Created by JeremyG on 25.07.2018.
 */

public class MainActivity extends BaseListActivity implements HasSupportFragmentInjector {

    @Inject
    DispatchingAndroidInjector<Fragment> dispatchingAndroidInjector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);

        initListFragment();

    }

    public void initListFragment() {
        getListFragment(RepoListFragment.newInstance());
    }

    @Override
    public AndroidInjector<Fragment> supportFragmentInjector() {
        return dispatchingAndroidInjector;
    }
}
