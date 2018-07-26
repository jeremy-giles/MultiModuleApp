package com.project.jeremyg.architecture.di;

import android.arch.lifecycle.ViewModelProvider;

import com.project.jeremyg.architecture.view_models.ArchitectureViewModelFactory;

import dagger.Binds;
import dagger.Module;

/**
 * Created by JeremyG on 26.07.2018.
 */

@Module
public abstract class ViewModelBuilder {

    @Binds
    abstract ViewModelProvider.Factory architectureViewModelFactory(ArchitectureViewModelFactory architectureViewModelFactory);

}
