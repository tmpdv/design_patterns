package design_patterns.behavioral.iterator;

import java.util.NoSuchElementException;

public interface Iterator<T> {
    T getNext() throws NoSuchElementException;
    boolean hasNext();
}
