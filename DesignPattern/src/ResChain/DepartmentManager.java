package ResChain;

/**
 * Created by Blue on 2018/3/8.
 */
public class DepartmentManager extends Handler {
    protected DepartmentManager(int maxDay) {
        super(maxDay);
    }

    @Override
    protected void reply(int day) {
        System.out.println(day + "天请假，总监审批通过");
    }
}
