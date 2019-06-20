public class SimpleFactoryTest {
    public static void test() {
        System.out.println("简单工厂模式");
        Operation operation = OperationFactory.createOperate("+");
        operation.setNumberA(1.0);
        operation.setNumberB(2.0);
        Double result = operation.getResult();
        System.out.println(result);
    }
}
