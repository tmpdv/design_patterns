package design_patterns.behavioral.iterator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class IteratorTest {

    @Test
    public void test() {
        SimpleList<Integer> list = new SimpleList<>(new Integer[]{1, 6, 10, 16, 61});
        Iterator<Integer> iterator = list.createIterator();

        assertEquals(1, iterator.getNext());
        assertEquals(6, iterator.getNext());
        assertEquals(10, iterator.getNext());
        assertEquals(16, iterator.getNext());
        assertEquals(61, iterator.getNext());
        assertFalse(iterator.hasNext());

        NoSuchElementException exception = Assertions.assertThrows(NoSuchElementException.class, iterator::getNext);
        assertEquals("No element found", exception.getMessage());
    }
}
