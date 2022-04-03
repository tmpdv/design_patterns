package design_patterns.behavioral.observer;

public class Subscriber implements Observer {

    private Integer state;

    public Subscriber(Integer state) {
        this.state = state;
    }

    @Override
    public void updateState(Integer newState) {
        state = newState;
    }

    @Override
    public Integer getState() {
        return state;
    }
}
