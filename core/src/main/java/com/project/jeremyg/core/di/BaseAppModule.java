package com.project.jeremyg.core.di;

import android.content.Context;

import dagger.Module;
import dagger.Provides;

/**
 * Created by JeremyG on 25.07.2018.
 */

@Module
public class BaseAppModule {

    /*
     * CONTEXT
     */
    @Provides
    public Context provideContext(Context baseContext) {
        return baseContext;
    }

}
