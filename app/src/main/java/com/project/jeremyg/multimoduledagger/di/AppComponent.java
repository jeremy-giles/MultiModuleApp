package com.project.jeremyg.multimoduledagger.di;

import android.content.Context;

import com.project.jeremyg.architecture.di.RepoModule;
import com.project.jeremyg.architecture.di.ViewModelModule;
import com.project.jeremyg.core.di.BaseAppModule;
import com.project.jeremyg.multimoduledagger.MyApp;
import com.project.jeremyg.multimoduledagger.ui.manager.RepoManager;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;

/**
 * Created by JeremyG on 25.07.2018.
 */

@Singleton
@Component(
            modules = {
                    AndroidInjectionModule.class,
                    ViewModelModule.class,
                    RepoModule.class,
                    BaseAppModule.class,
                    ActivityModule.class,
                    FragmentModule.class,
                    AppModule.class
            }
)
public interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder baseContext(Context baseContext);

        AppComponent build();
    }

    void inject(MyApp MyApp);

    void inject(RepoManager repoManager);

}
