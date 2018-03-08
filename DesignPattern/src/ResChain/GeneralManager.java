package ResChain;

/**
 * Created by Blue on 2018/3/8.
 */
public class GeneralManager extends Handler {
    protected GeneralManager(int maxDay) {
        super(maxDay);
    }

    @Override
    protected void reply(int day) {
        System.out.println(day + "天请假，总经理审批通过");
    }
}
