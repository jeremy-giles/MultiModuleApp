package com.project.jeremyg.architecture.entities;

import com.google.gson.annotations.SerializedName;

/**
 * Created by JeremyG on 25.07.2018.
 */

public class Repo {

    @SerializedName("name")
    private String name;

    @SerializedName("html_url")
    private String url;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
