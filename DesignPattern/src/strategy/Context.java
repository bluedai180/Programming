package strategy;

/**
 * Created by Blue on 2018/3/6.
 */
public class Context {
    private AbstractStrategy strategy;

    public void setStrategy(AbstractStrategy strategy) {
        this.strategy = strategy;
    }

    public int caculatePrice(int km) {
        return strategy.calculatePrice(km);
    }
}
