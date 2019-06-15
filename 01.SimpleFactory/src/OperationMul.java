/**
 * Created by Administrator on 2019/6/15.
 */
public class OperationMul extends Operation {
    @Override
    public Double getResult() {
        Double result = this.getNumberA() * this.getNumberB();
        return result;
    }
}
