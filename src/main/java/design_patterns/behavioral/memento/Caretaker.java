package design_patterns.behavioral.memento;

import java.util.LinkedList;

public class Caretaker {

    private final Originator originator = new Originator();

    private LinkedList<Memento> saves;

    public Caretaker(State state) {
        originator.setState(state);
    }

    public State getCurrentState() {
        return originator.getState();
    }

    public void changeState(Integer x, Integer y, Integer z) {
        Memento memento = originator.save();
        if (saves == null) {
            saves = new LinkedList<>();
        }
        saves.add(memento);

        State currentState = memento.getState();
        x = x == null ? currentState.getX() : x;
        y = y == null ? currentState.getY() : y;
        z = z == null ? currentState.getZ() : z;
        originator.setState(new State(x, y, z));
    }

    public void undo() {
        Memento memento = saves.getLast();
        originator.restore(memento);
    }
}
