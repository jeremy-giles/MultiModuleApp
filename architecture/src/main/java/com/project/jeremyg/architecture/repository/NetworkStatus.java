package com.project.jeremyg.architecture.repository;

/**
 * Created by JeremyG on 25.07.2018.
 */

public class NetworkStatus {

    public enum StatusType {
        PENDING,
        SUCCESS,
        FAILED
    }

    private StatusType status;

    public StatusType getStatus() {
        return status;
    }

    public NetworkStatus(StatusType status) {
       this.status = status;
    }

}
