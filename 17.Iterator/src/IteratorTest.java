public class IteratorTest {
    public static void test() {
        System.out.println("迭代器模式");

        ConcreteAggregate aggregate = new ConcreteAggregate();
        aggregate.add("小菜");
        aggregate.add("大鸟");
        aggregate.add("行李");
        aggregate.add("老外");

        Iterator iterator = aggregate.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
