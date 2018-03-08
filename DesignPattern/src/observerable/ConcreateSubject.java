package observerable;

/**
 * Created by Blue on 2018/3/8.
 */
public class ConcreateSubject extends Subject {
    private String state;

    public String getState() {
        return this.state;
    }

    public void change(String state) {
        this.state = state;
        System.out.println("ConcreateSubject State: " + this.state);
        nodifyObserver(state);
    }
}
