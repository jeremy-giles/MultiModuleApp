package com.project.jeremyg.multimoduledagger.di;

import android.content.Context;

import com.project.jeremyg.architecture.di.ArchitectureComponent;
import com.project.jeremyg.architecture.di.RepoModule;
import com.project.jeremyg.architecture.di.ViewModelModule;
import com.project.jeremyg.core.di.BaseAppModule;
import com.project.jeremyg.multimoduledagger.App;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;

/**
 * Created by JeremyG on 25.07.2018.
 */
@ActivityScope
@Component(
        dependencies = {
            ArchitectureComponent.class
        },
            modules = {
                AndroidInjectionModule.class,
                BaseAppModule.class,
                ActivityModule.class,
                FragmentModule.class
            }
)
public interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder baseContext(Context baseContext);

        AppComponent build();
    }

    void inject(App App);

}
