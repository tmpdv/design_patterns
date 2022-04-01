package design_patterns.behavioral.iterator;

public interface IterableCollection<T> {
    Iterator<T> createIterator();
}
