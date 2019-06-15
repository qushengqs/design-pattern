/**
 * Created by Administrator on 2019/6/15.
 */
public class Main {
    public static void main(String[] args) {
        Operation operation = OperationFactory.createOperate("+");
        operation.setNumberA(1.0);
        operation.setNumberB(2.0);
        Double result = operation.getResult();
        System.out.println(result);
    }
}
