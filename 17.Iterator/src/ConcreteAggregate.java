import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate<T> implements Aggregate<T> {
    private List<T> lists = new ArrayList<>();


    @Override
    public Iterator<T> createIterator() {
        return new ConcreteIterator<>(lists);
    }

    public void add(T t) {
        this.lists.add(t);
    }

    public void remove(T t) {
        this.lists.remove(t);
    }
}
