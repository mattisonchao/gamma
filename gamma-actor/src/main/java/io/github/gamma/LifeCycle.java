package io.github.gamma;

public interface LifeCycle {

    enum LifeState {
        PREPARE,
        RUNNING,
        DETERMINATE
    }

    void setup();

    void shutdown();


}
