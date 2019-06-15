import java.util.Objects;

/**
 * Created by Administrator on 2019/6/15.
 */
public class OperationDiv extends Operation {
    @Override
    public Double getResult() {
        if (Objects.equals(this.getNumberB(), 0.0))
            return 0.0;

        Double result = this.getNumberA() / this.getNumberB();
        return result;
    }
}
