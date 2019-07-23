import java.util.List;
import java.util.NoSuchElementException;

public class ConcreteIterator<T> implements Iterator<T> {
    private List<T> lists;
    private int cursor;

    public ConcreteIterator(List<T> list) {
        this.lists = list;
    }


    @Override
    public T first() {
        return lists.get(0);
    }

    @Override
    public T next() {
        int i = cursor;
        if (i > lists.size()) {
            throw new NoSuchElementException();
        }

        cursor = i + 1;
        return lists.get(i);
    }

    @Override
    public boolean hasNext() {
        return cursor != lists.size();
    }

    @Override
    public T currentItem() {
        return lists.get(cursor);
    }
}
