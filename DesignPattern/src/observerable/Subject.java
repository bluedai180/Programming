package observerable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Blue on 2018/3/8.
 */
public abstract class Subject {
    private List<Observer> mObserver = new ArrayList<Observer>();

    public void attach(Observer observer) {
        mObserver.add(observer);
    }

    public void detach(Observer observer) {
        mObserver.remove(observer);
    }

    public void nodifyObserver(String newState) {
        for (Observer observer : mObserver) {
            observer.update(newState);
        }
    }
}
