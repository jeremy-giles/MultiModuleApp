package com.project.jeremyg.multimoduledagger.ui.fragments;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.project.jeremyg.architecture.entities.Repo;
import com.project.jeremyg.architecture.view_models.ArchitectureViewModelFactory;
import com.project.jeremyg.architecture.view_models.RepoViewModel;
import com.project.jeremyg.core.ui.fragments.BaseListFragment;
import com.project.jeremyg.multimoduledagger.R;

import java.util.List;

import javax.inject.Inject;

import dagger.android.support.AndroidSupportInjection;

/**
 * Created by JeremyG on 25.07.2018.
 */

public class RepoListFragment extends BaseListFragment {

    @Inject
    public ArchitectureViewModelFactory architectureViewModelFactory;
    public RepoViewModel repoViewModel;

    private MyRepoRecyclerViewAdapter mAdapter;


    public RepoListFragment() {}

    public static RepoListFragment newInstance() {
        return new RepoListFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        AndroidSupportInjection.inject(this);

        initViewModels();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_repo_list, container, false);

        if (view instanceof RecyclerView) {
            RecyclerView recyclerView = (RecyclerView) view;
            mAdapter = new MyRepoRecyclerViewAdapter();
            recyclerView.setAdapter(mAdapter);
        }
        return view;
    }

    private void initViewModels() {
        repoViewModel = ViewModelProviders.of(this, architectureViewModelFactory).get(RepoViewModel.class);

        repoViewModel.getAllRepo(this).observe(this, new Observer<List<Repo>>() {
            @Override
            public void onChanged(@Nullable List<Repo> repos) {
                mAdapter.addRepositories(repos);
            }
        });
    }

}
