package singleton;

/**
 * Created by Blue on 2018/3/5.
 */
public class StaticInnerSingleton {

    private StaticInnerSingleton() {
    }

    public static StaticInnerSingleton getInstance() {
        return SingletonHolder.mInstance;
    }

    private static class SingletonHolder {
        private static final StaticInnerSingleton mInstance = new StaticInnerSingleton();
    }
}
