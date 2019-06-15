/**
 * Created by Administrator on 2019/6/15.
 */
public class CashFactoryContext {
    private CashSuper cashSuper;

    public CashFactoryContext(String type) {
        switch (type) {
            case "正常收费":
                cashSuper = new CashNormal();
                break;
            case "满300减100":
                cashSuper = new CashReturn(300.0, 100.0);
                break;
            case "打8折":
                cashSuper = new CashRebate(0.8);
                break;
        }
    }

    public Double getResult(Double money) {
        return cashSuper.acceptCash(money);
    }
}
