package strategy;

/**
 * Created by Blue on 2018/3/6.
 */
public class PriceCalculate {
    private static final int BUS = 1;
    private static final int SUBWAY = 2;

    public static void main(String[] args) {
        PriceCalculate priceCalculate = new PriceCalculate();
        System.out.println("做20km公交票价：" + priceCalculate.calculatePrice(11, BUS));
    }

    /**
     * 公交计价，10公里之内1块钱，超过10公里每5公里1块钱
     *
     * @param km
     * @return
     */
    private int busPrice(int km) {
        int extraTotal = km - 10;
        int extraFactor = extraTotal / 5;
        int faction = extraFactor % 5;
        int price = 1 + extraFactor % 5;
        return faction > 0 ? ++price : price;
    }

    /**
     * 地铁售价
     * @param km
     * @return
     */
    private int subwayPrice(int km) {
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

    public int calculatePrice(int km, int type){
        if (type==BUS){
            return busPrice(km);
        } else if (type==SUBWAY){
            return subwayPrice(km);
        }
        return 0;
    }
}
