public class DecoratorTest {
    public static void test() {
        System.out.println("装饰模式");
        Person person = new Person("小菜");

        Sneakers sneakers = new Sneakers();
        BigTrouser bigTrouser = new BigTrouser();
        TShirts tShirts = new TShirts();

        sneakers.decorate(person);
        bigTrouser.decorate(sneakers);
        tShirts.decorate(bigTrouser);

        tShirts.show();
    }
}
