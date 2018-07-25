package com.project.jeremyg.multimoduledagger.di;

import com.project.jeremyg.architecture.di.ViewModelComponent;
import com.project.jeremyg.core.di.BaseAppComponent;
import com.project.jeremyg.multimoduledagger.App;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by JeremyG on 25.07.2018.
 */

@Singleton
@Component(
        dependencies = {
                BaseAppComponent.class,
                ViewModelComponent.class
        },
        modules = {
                ActivityModule.class,
                FragmentModule.class
        })
public interface AppComponent {

        void inject(App app);

}
