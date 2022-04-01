package design_patterns.behavioral.iterator;

import java.util.NoSuchElementException;

public class ListIterator<T> implements Iterator<T> {

    private final SimpleList<T> list;

    private int currentPosition = 0;

    public ListIterator(SimpleList<T> list) {
        this.list = list;
    }

    @Override
    public T getNext() throws NoSuchElementException {
        if (!hasNext()) {
            throw new NoSuchElementException("No element found");
        }
        return list.get(currentPosition++);
    }

    @Override
    public boolean hasNext() {
        try {
            list.get(currentPosition);
            return true;
        } catch (ArrayIndexOutOfBoundsException e) {
            return false;
        }
    }
}
