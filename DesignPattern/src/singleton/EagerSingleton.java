package singleton;

/**
 * Created by Blue on 2018/3/5.
 */
public class EagerSingleton {
    private final static EagerSingleton mEagerSingleton = new EagerSingleton();
    private EagerSingleton() {
        System.out.println("create singleton");
    }
    public static EagerSingleton getEagerSingleton() {
        return mEagerSingleton;
    }
}
