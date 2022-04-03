package design_patterns.behavioral.memento;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MementoTest {

    @Test
    public void test() {
        State state = new State(1, 2, 3);
        Caretaker caretaker = new Caretaker(state);

        caretaker.changeState(5, null, 7);
        assertEquals(new State(5, 2, 7), caretaker.getCurrentState());

        caretaker.undo();
        assertEquals(state, caretaker.getCurrentState());
    }
}
