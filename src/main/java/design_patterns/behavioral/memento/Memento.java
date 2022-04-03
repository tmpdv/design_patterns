package design_patterns.behavioral.memento;

import java.time.LocalDateTime;

public final class Memento {

    private final State state;

    private final LocalDateTime saveTime;

    public Memento(State state, LocalDateTime saveTime) {
        this.state = state;
        this.saveTime = saveTime;
    }

    public State getState() {
        return state;
    }

    public LocalDateTime getSaveTime() {
        return saveTime;
    }
}
