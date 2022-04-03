package design_patterns.behavioral.memento;

import java.time.LocalDateTime;

public class Originator {

    private State state;

    public Memento save() {
        return new Memento(state, LocalDateTime.now());
    }

    public void restore(Memento memento) {
        this.state = memento.getState();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
