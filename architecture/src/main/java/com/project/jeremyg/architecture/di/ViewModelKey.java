package com.project.jeremyg.architecture.di;

import android.arch.lifecycle.ViewModel;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import dagger.MapKey;

/**
 * Created by JeremyG on 25.07.2018.
 */

@Documented
@MapKey
@Retention(RetentionPolicy.RUNTIME)
public @interface ViewModelKey {
    Class<? extends ViewModel> value();
}
