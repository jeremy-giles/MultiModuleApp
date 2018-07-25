package com.project.jeremyg.architecture.view_models;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.Observer;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.project.jeremyg.architecture.entities.Repo;
import com.project.jeremyg.architecture.repository.GithubRepository;
import com.project.jeremyg.architecture.repository.NetworkStatus;

import java.util.List;

/**
 * Created by JeremyG on 25.07.2018.
 */

public class RepoViewModel extends AndroidViewModel {

    public GithubRepository githubRepository;

    public RepoViewModel(@NonNull Application application) {
        super(application);
    }

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
