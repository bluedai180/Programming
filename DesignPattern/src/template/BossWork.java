package template;

/**
 * Created by Blue on 2018/3/8.
 */
public class BossWork extends AbstractWork {
    @Override
    protected void goToWork() {
        System.out.println("老板开车上班");
    }

    @Override
    protected void work() {
        System.out.println("老板分配工作给员工");
    }

    @Override
    protected void getOffWork() {
        System.out.println("老板开车下班");
    }
}
