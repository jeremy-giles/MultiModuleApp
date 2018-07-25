package com.project.jeremyg.architecture.repository;

import android.arch.lifecycle.MutableLiveData;
import android.util.Log;

import com.project.jeremyg.architecture.api.RestAPI;
import com.project.jeremyg.architecture.entities.Repo;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by JeremyG on 25.07.2018.
 */

public class GithubRepository {

    private static final String TAG = GithubRepository.class.getSimpleName();

    private RestAPI restAPI;

    private List<Repo> database = new ArrayList<>();

    private MutableLiveData<NetworkStatus> status;

    @Inject
    public GithubRepository(RestAPI restAPI) {
        this.restAPI = restAPI;
        status = new MutableLiveData<>();
    }

    public MutableLiveData<NetworkStatus> getStatus() {
        return status;
    }

    public List<Repo> getDatabase() {
        return database;
    }

    public void getAllRepo() {
        status.setValue(new NetworkStatus(NetworkStatus.StatusType.PENDING));

        restAPI.listRepos("jeremy-giles").enqueue(new Callback<List<Repo>>() {
            @Override
            public void onResponse(Call<List<Repo>> call, Response<List<Repo>> response) {
                database = response.body();
                status.setValue(new NetworkStatus(NetworkStatus.StatusType.SUCCESS));
            }

            @Override
            public void onFailure(Call<List<Repo>> call, Throwable t) {
                status.setValue(new NetworkStatus(NetworkStatus.StatusType.FAILED));
                Log.e(TAG, "getAllRepo reauest failed", t);
            }
        });
    }

}
