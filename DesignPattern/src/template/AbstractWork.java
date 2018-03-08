package template;

/**
 * Created by Blue on 2018/3/8.
 */
public abstract class AbstractWork {
    protected void getUp() {
        System.out.println("起床了");
    }

    protected abstract void goToWork();

    protected abstract void work();

    protected abstract void getOffWork();

    public final void newDay() {
        getUp();
        goToWork();
        work();
        getOffWork();
    }
}
