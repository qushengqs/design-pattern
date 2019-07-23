public interface Iterator<T> {
    T first();
    T next();
    boolean hasNext();
    T currentItem();
}
