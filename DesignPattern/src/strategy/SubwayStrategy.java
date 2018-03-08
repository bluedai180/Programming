package strategy;

/**
 * Created by Blue on 2018/3/6.
 */
public class SubwayStrategy implements AbstractStrategy {
    @Override
    public int calculatePrice(int km) {
        if (km <= 6) {
            return 3;
        } else if (km > 6 && km < 12) {
            return 4;
        } else if (km > 12 && km < 24) {
            return 5;
        } else if (km > 24 && km < 32) {
            return 6;
        }
        return 7;
    }
}
