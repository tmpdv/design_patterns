package design_patterns.creational.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SingletonTest {

    @Test
    public void testSingularity() {
        Singleton firstRef = Singleton.getInstance();
        Singleton secondRef = Singleton.getInstance();
        assertEquals(firstRef, secondRef);
    }
}
