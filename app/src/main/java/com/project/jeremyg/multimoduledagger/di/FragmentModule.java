package com.project.jeremyg.multimoduledagger.di;

import com.project.jeremyg.multimoduledagger.ui.fragments.RepoListFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by JeremyG on 25.07.2018.
 */

@Module
public abstract class FragmentModule {

    @ContributesAndroidInjector
    abstract RepoListFragment contributeRepoListFragment();

}
