package com.project.jeremyg.architecture.di;

import com.project.jeremyg.architecture.view_models.RepoViewModel;

import dagger.Component;

/**
 * Created by JeremyG on 25.07.2018.
 */

@Component(modules = {
        ViewModelModule.class
})
public interface ViewModelComponent {

    void inject(RepoViewModel repoViewModel);

}
