/**
 * Created by Administrator on 2019/6/15.
 */
public class CashReturn extends CashSuper {
    private Double moneyCondition = 0.0;
    private Double moneyReturn = 0.0;

    public CashReturn(Double moneyCondition, Double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public Double acceptCash(Double money) {
        Double result = 0.0;
        if (money >= this.moneyCondition) {
            result = money - Math.floor(money / this.moneyCondition) * this.moneyReturn;
        }
        return result;
    }
}
