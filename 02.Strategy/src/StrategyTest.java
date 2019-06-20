public class StrategyTest {
    public static void test() {
        System.out.println("策略模式");
        CashSuper cashSuper = new CashRebate(0.8);
        CashContext cashContext = new CashContext(cashSuper);
        Double result = cashContext.getResult(800.0);
        System.out.println(result);
    }

    public static void factoryTest() {
        System.out.println("策略+简单工厂模式");
        CashFactoryContext cashFactoryContext = new CashFactoryContext("满300减100");
        Double result = cashFactoryContext.getResult(700.0);
        System.out.println(result);
    }
}
