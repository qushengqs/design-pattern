/**
 * Created by Administrator on 2019/6/15.
 */
public class Main {
    public static void main(String[] args) {
        simpleFactoryTest();
        strategyTest();
        strategyFactoryTest();
        decoratorTest();
        proxyTest();
        factoryTest();
        prototypeTest();
        prototypeDeepTest();
        templateTest();
        facadeTest();
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

    /**
     * 代理模式
     */
    public static void proxyTest() {
        System.out.println("代理模式");

        SchoolGirl schoolGirl = new SchoolGirl();
        schoolGirl.setName("李娇娇");

        Proxy proxy = new Proxy(schoolGirl);
        proxy.giveDolls();
        proxy.giveFlowers();
        proxy.giveChocolate();
    }

    /**
     * 工厂模式
     */
    public static void factoryTest() {
        System.out.println("工厂模式");

        IFactory iFactory = new AddFactory();
        Operation operation = iFactory.createOperation();

        operation.setNumberA(1.0);
        operation.setNumberB(2.0);
        Double result = operation.getResult();
        System.out.println(result);
    }

    /**
     * 原型模式
     */
    public static void prototypeTest() {
        try {
            System.out.println("原型模式");
            Resume resume = new Resume("大鸟");
            resume.setPersonalInfo("男", "29");
            resume.setWorkExperience("1998-2000", "XX公司");

            Resume resumeB = (Resume) resume.clone();
            resumeB.setWorkExperience("1998-2006", "YY企业");

            Resume resumeC = (Resume) resume.clone();
            resumeC.setPersonalInfo("男", "24");

            resume.display();
            resumeB.display();
            resumeC.display();
        } catch (CloneNotSupportedException ex) {
            System.out.println(ex);
        }
    }

    /**
     * 原型模式--深拷贝
     */
    public static void prototypeDeepTest() {
        try {
            System.out.println("原型模式--深拷贝");
            ResumeDeep resumeDeep = new ResumeDeep("大鸟");
            resumeDeep.setPersonInfo("男", "29");
            resumeDeep.setWorkExperience("1998-2000", "XX公司");

            ResumeDeep resumeDeepB = (ResumeDeep) resumeDeep.clone();
            resumeDeepB.setWorkExperience("1998-2006", "YY企业");

            ResumeDeep resumeDeepC = (ResumeDeep) resumeDeep.clone();
            resumeDeepC.setPersonInfo("男", "24");
            resumeDeepC.setWorkExperience("1998-2003", "ZZ企业");

            resumeDeep.display();
            resumeDeepB.display();
            ;
            resumeDeepC.display();
        } catch (CloneNotSupportedException ex) {
            System.out.println(ex);
        }
    }

    /**
     * 模板模式
     */
    public static void templateTest() {
        System.out.println("模板模式");

        AbstractClass abstractClass;

        abstractClass = new ConcreteClassA();
        abstractClass.templateMethod();

        abstractClass = new ConcreteClassB();
        abstractClass.templateMethod();
    }

    /**
     * 外观模式
     */
    public static void facadeTest() {
        System.out.println("外观模式");

        Facade facade = new Facade();

        facade.methodA();
        facade.methodB();
    }
}
