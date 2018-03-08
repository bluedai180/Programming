package strategy;

/**
 * Created by Blue on 2018/3/6.
 */
public class BusStrategy implements AbstractStrategy{

    @Override
    public int calculatePrice(int km) {
        int extraTotal = km - 10;
        int extraFactor = extraTotal / 5;
        int faction = extraFactor % 5;
        int price = 1 + extraFactor % 5;
        return faction > 0 ? ++price : price;
    }
}
