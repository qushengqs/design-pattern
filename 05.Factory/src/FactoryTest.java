public class FactoryTest {
    public static void test() {
        System.out.println("工厂模式");

        IFactory iFactory = new AddFactory();
        Operation operation = iFactory.createOperation();

        operation.setNumberA(1.0);
        operation.setNumberB(2.0);
        Double result = operation.getResult();
        System.out.println(result);
    }
}
