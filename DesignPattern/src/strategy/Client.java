package strategy;

/**
 * Created by Blue on 2018/3/6.
 */
public class Client {
    public static void main(String[] args) {
        Context calculate = new Context();
        calculate.setStrategy(new BusStrategy());
        System.out.println("公交车20km价格：" + calculate.caculatePrice(20));
    }
}
