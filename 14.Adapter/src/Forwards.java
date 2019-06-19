public class Forwards extends Player {

    public Forwards(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println(String.format("前锋%s进攻", this.getName()));
    }

    @Override
    public void defense() {
        System.out.println(String.format("前锋%s防守", this.getName()));
    }
}
