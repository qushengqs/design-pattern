public class Proxy implements IGiveGift {

    private Pursuit pursuit;
    public Proxy(SchoolGirl schoolGirl){
        this.pursuit=new Pursuit(schoolGirl);
    }

    @Override
    public void giveDolls() {
pursuit.giveDolls();
    }

    @Override
    public void giveFlowers() {
pursuit.giveFlowers();
    }

    @Override
    public void giveChocolate() {
pursuit.giveChocolate();
    }
}
