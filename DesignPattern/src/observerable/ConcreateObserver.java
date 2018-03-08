package observerable;

/**
 * Created by Blue on 2018/3/8.
 */
public class ConcreateObserver implements Observer {

    private String observerState;

    @Override
    public void update(String state) {
        this.observerState = state;
        System.out.println("ConcreateObserver State: " + state);
    }
}
