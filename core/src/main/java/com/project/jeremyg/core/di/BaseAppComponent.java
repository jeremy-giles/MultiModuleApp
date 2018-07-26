package com.project.jeremyg.core.di;

import com.project.jeremyg.core.BaseApp;

import dagger.Component;

/**
 * Created by JeremyG on 25.07.2018.
 */

@Component(
        modules = {
                BaseAppModule.class
})
public interface BaseAppComponent {

   // void inject(BaseApp baseApp);

}
