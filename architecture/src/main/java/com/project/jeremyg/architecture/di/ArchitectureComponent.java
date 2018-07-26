package com.project.jeremyg.architecture.di;

import android.content.Context;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

/**
 * Created by JeremyG on 26.07.2018.
 */

@Singleton
@Component( modules = {
                RepoModule.class,
                ViewModelModule.class
})
public interface ArchitectureComponent {

}
