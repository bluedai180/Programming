package template;

/**
 * Created by Blue on 2018/3/8.
 */
public class StaffWork extends AbstractWork {
    @Override
    protected void goToWork() {
        System.out.println("员工走路去上班");
    }

    @Override
    protected void work() {
        System.out.println("员工努力工作");
    }

    @Override
    protected void getOffWork() {
        System.out.println("员工走路下班");
    }
}
