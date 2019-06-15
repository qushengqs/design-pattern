/**
 * Created by Administrator on 2019/6/15.
 */
public class CashContext {

    private CashSuper cashSuper;

    public CashContext(CashSuper cashSuper) {
        this.cashSuper = cashSuper;
    }

    public Double getResult(Double money) {
        return this.cashSuper.acceptCash(money);
    }
}
