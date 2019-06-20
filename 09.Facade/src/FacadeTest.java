public class FacadeTest {
    public static void test() {
        System.out.println("外观模式");

        Facade facade = new Facade();

        facade.methodA();
        facade.methodB();
    }
}
