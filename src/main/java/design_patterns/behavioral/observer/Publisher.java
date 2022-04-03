package design_patterns.behavioral.observer;

import java.util.HashSet;
import java.util.Set;

public class Publisher {

    private Set<Observer> subscribers;
    private Integer state = 0;

    public Integer getState() {
        return state;
    }

    public void updateState(Integer state) {
        this.state = state;
        notifySubscribers();
    }

    public void subscribe(Observer subscriber) {
        if (subscribers == null) {
            subscribers = new HashSet<>();
        }
        subscribers.add(subscriber);
    }

    public void unsubscribe(Observer subscriber) {
        if (subscribers != null) {
            subscribers.remove(subscriber);
        }
    }

    private void notifySubscribers() {
        subscribers.forEach(s -> s.updateState(state));
    }
}
