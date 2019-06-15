/**
 * Created by Administrator on 2019/6/15.
 */
public class CashRebate extends CashSuper {

    private Double moneyRebate = 1.0;

    public CashRebate(Double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }

    @Override
    public Double acceptCash(Double money) {
        Double result = money * this.moneyRebate;
        return result;
    }
}
