package design_patterns.behavioral.iterator;

public class SimpleList<T> implements IterableCollection<T> {

    private final T[] elements;

    public SimpleList(T[] elements) {
        this.elements = elements;
    }

    @Override
    public Iterator<T> createIterator() {
        return new ListIterator<>(this);
    }

    public T get(int i) {
        return elements[i];
    }
}
