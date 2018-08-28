package com.project.jeremyg.multimoduledagger.ui.manager;

import com.project.jeremyg.architecture.repository.GithubRepository;

import javax.inject.Inject;

/**
 * Created by JeremyG on 28.08.2018.
 */

public class RepoManager {

    @Inject
    GithubRepository githubRepository;

    public void useGithubRepository() {
        githubRepository.getAllRepo();
    }

}
