/**
 * Created by Administrator on 2019/6/15.
 */
public class Main {
    public static void main(String[] args) {
        simpleFactoryTest();
        strategyTest();
        strategyFactoryTest();
        decoratorTest();
    }

    /**
     * 简单工厂模式
     */
    public static void simpleFactoryTest() {
        System.out.println("简单工厂模式");
        Operation operation = OperationFactory.createOperate("+");
        operation.setNumberA(1.0);
        operation.setNumberB(2.0);
        Double result = operation.getResult();
        System.out.println(result);
    }

    /**
     * 策略模式
     */
    public static void strategyTest() {
        System.out.println("策略模式");
        CashSuper cashSuper = new CashRebate(0.8);
        CashContext cashContext = new CashContext(cashSuper);
        Double result = cashContext.getResult(800.0);
        System.out.println(result);
    }

    /**
     * 策略+简单工厂模式
     */
    public static void strategyFactoryTest() {
        System.out.println("策略+简单工厂模式");
        CashFactoryContext cashFactoryContext = new CashFactoryContext("满300减100");
        Double result = cashFactoryContext.getResult(700.0);
        System.out.println(result);
    }

    /**
     * 装饰模式
     */
    public static void decoratorTest() {
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
