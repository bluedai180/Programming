package observerable;

/**
 * Created by Blue on 2018/3/8.
 */
public class Test {
    public static void main(String[] args) {
        ConcreateSubject concreateSubject = new ConcreateSubject();
        Observer observer = new ConcreateObserver();
        concreateSubject.attach(observer);
        concreateSubject.change("change");
    }
}
