package com.project.jeremyg.architecture.api;

import com.project.jeremyg.architecture.entities.Repo;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by JeremyG on 25.07.2018.
 */

public interface RestAPI {

    @GET("users/{user}/repos")
    Call<List<Repo>> listRepos(@Path("user") String user);

}