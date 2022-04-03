package design_patterns.behavioral.observer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ObserverTest {

    @Test
    public void test() {
        Publisher publisher = new Publisher();

        Subscriber subscriber1 = new Subscriber(111);
        Subscriber subscriber2 = new Subscriber(333);
        Subscriber subscriber3 = new Subscriber(666);

        publisher.subscribe(subscriber1);
        publisher.subscribe(subscriber2);
        publisher.subscribe(subscriber3);

        publisher.updateState(1);

        assertEquals(1, subscriber1.getState());
        assertEquals(1, subscriber2.getState());
        assertEquals(1, subscriber3.getState());
    }

}
