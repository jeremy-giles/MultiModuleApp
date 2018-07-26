package com.project.jeremyg.architecture.view_models;

import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModel;
import android.support.annotation.Nullable;

import com.project.jeremyg.architecture.entities.Repo;
import com.project.jeremyg.architecture.repository.GithubRepository;
import com.project.jeremyg.architecture.repository.NetworkStatus;

import java.util.List;

/**
 * Created by JeremyG on 25.07.2018.
 */

public class RepoViewModel extends ViewModel {

    public GithubRepository githubRepository;

    public LiveData<List<Repo>> getAllRepo(LifecycleOwner owner) {

        final MutableLiveData<List<Repo>> repos = new MutableLiveData<>();

        githubRepository.getStatus().observe(owner, new Observer<NetworkStatus>() {
            @Override
            public void onChanged(@Nullable NetworkStatus networkStatus) {
                switch (networkStatus.getStatus()) {
                    case SUCCESS:
                        repos.setValue(githubRepository.getDatabase());
                        break;
                }
            }
        });

        return repos;
    }

}
