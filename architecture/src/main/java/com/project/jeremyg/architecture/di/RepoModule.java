package com.project.jeremyg.architecture.di;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.project.jeremyg.architecture.api.RestAPI;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by JeremyG on 25.07.2018.
 */

@Module
public class RepoModule {

    /*
     * NETWORK INJECTION
     */

    @Provides
    public Gson provideGson() {
        return new GsonBuilder().create();
    }

    @Provides
    public Retrofit provideRetrofit(Gson gson) {
        Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create(gson))
                .baseUrl("https://api.github.com/")
                .build();

        return retrofit;
    }

    @Provides
    public RestAPI provideRestAPI(Retrofit restAdapter) {
        return restAdapter.create(RestAPI.class);
    }

}
