package com.project.jeremyg.core.di;

import android.content.Context;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * Created by JeremyG on 25.07.2018.
 */

@Module
public class BaseAppModule {

    @Named("baseAppContext")
    public Context baseAppContext;

    public BaseAppModule(Context context) {
        this.baseAppContext = context;
    }

    /*
     * CONTEXT
     */
    @Provides
    public Context provideContext() {
        return baseAppContext;
    }

}
