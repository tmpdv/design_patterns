package design_patterns.behavioral.observer;

public interface Observer {

    void updateState(Integer newState);

    Integer getState();
}
