package ResChain;

/**
 * Created by Blue on 2018/3/8.
 */
public class ProjectManager extends Handler {
    protected ProjectManager(int maxDay) {
        super(maxDay);
    }

    @Override
    protected void reply(int day) {
        System.out.println(day + "天请假，项目经理直接审批通过");
    }
}
