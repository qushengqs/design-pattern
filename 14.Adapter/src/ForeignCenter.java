public class ForeignCenter {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void attack() {
        System.out.println(String.format("外籍中锋%s进攻", this.name));
    }

    public void defense() {
        System.out.println(String.format("外籍中锋%s防守", this.name));
    }
}
