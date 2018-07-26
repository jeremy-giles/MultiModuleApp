package com.project.jeremyg.multimoduledagger.di;

import android.content.Context;

import com.project.jeremyg.architecture.di.RepoModule;
import com.project.jeremyg.architecture.di.ViewModelBuilder;
import com.project.jeremyg.core.BaseApp;
import com.project.jeremyg.core.di.BaseAppModule;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * Created by JeremyG on 25.07.2018.
 */

@Component(
            modules = {
                    AndroidSupportInjectionModule.class,
                    ViewModelBuilder.class,
                    RepoModule.class,
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

    void inject(BaseApp baseApp);

}
