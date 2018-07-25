package com.project.jeremyg.multimoduledagger.ui.fragments;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.project.jeremyg.architecture.entities.Repo;
import com.project.jeremyg.multimoduledagger.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by JeremyG on 25.07.2018.
 */

public class MyRepoRecyclerViewAdapter extends RecyclerView.Adapter<MyRepoRecyclerViewAdapter.ViewHolder> {

    private List<Repo> mRepos = new ArrayList<>();

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_repo_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mNameView.setText(mRepos.get(position).getName());
        holder.mUrlView.setText(mRepos.get(position).getUrl());
    }

    @Override
    public int getItemCount() {
        return mRepos.size();
    }

    public void addRepositories(List<Repo> repos) {
        this.mRepos = repos;
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView mNameView;
        private final TextView mUrlView;

        private ViewHolder(View view) {
            super(view);
            mNameView = view.findViewById(R.id.repo_name);
            mUrlView = view.findViewById(R.id.repo_url);
        }
    }
}
