public class ObserverTest {
    public static void test() {
        System.out.println("观察者模式");

        ConcreteSubject subject = new ConcreteSubject();

        subject.attach(new ConcreteObserver(subject, "X"));
        subject.attach(new ConcreteObserver(subject, "Y"));
        subject.attach(new ConcreteObserver(subject, "Z"));

        subject.setSubjectState("ABC");
        subject.modify();
    }
}
