package com.project.jeremyg.architecture.di;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;

import com.project.jeremyg.architecture.view_models.ArchitectureViewModelFactory;
import com.project.jeremyg.architecture.view_models.RepoViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

/**
 * Created by JeremyG on 25.07.2018.
 */

@Module
public abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(RepoViewModel.class)
    abstract ViewModel bindRepoViewModel(RepoViewModel repoViewModel);

    @Binds
    abstract ViewModelProvider.Factory bindArchitectureViewModelFactory(ArchitectureViewModelFactory factory);

}
