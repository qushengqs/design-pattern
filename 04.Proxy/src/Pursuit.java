public class Pursuit implements IGiveGift {

    private SchoolGirl schoolGirl;

    public Pursuit(SchoolGirl schoolGirl) {
        this.schoolGirl = schoolGirl;
    }


    @Override
    public void giveDolls() {
        System.out.println(String.format("%s送你洋娃娃", this.schoolGirl.getName()));
    }

    @Override
    public void giveFlowers() {
        System.out.println(String.format("%s送你鲜花", this.schoolGirl.getName()));
    }

    @Override
    public void giveChocolate() {
        System.out.println(String.format("%s送你巧克力", this.schoolGirl.getName()));
    }
}
