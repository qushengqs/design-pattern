public class ConcreteObserver extends Observer {
    private String name;
    private String observerState;
    private ConcreteSubject concreteSubject;

    public ConcreteObserver(ConcreteSubject concreteSubject, String name) {
        this.concreteSubject = concreteSubject;
        this.name = name;
    }

    @Override
    public void update() {
        observerState = this.concreteSubject.getSubjectState();
        System.out.println(String.format("观察者%s的新状态是%s", this.name, observerState));
    }

    public String getObserverState() {
        return observerState;
    }

    public void setObserverState(String observerState) {
        this.observerState = observerState;
    }
}
