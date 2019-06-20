public class Originator {
    private String state;

    public Memento createMemento() {
        return new Memento(this.state);
    }

    public void setMemento(Memento memento) {
        this.state = memento.getState();
    }

    public void show() {
        System.out.println(String.format("State = %s", this.state));
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
