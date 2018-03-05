package singleton;

/**
 * Created by Blue on 2018/3/5.
 */
public class LazySaftySingleton {
    private static LazySaftySingleton mLazySaftySingleton = null;
    private LazySaftySingleton() {

    }
    public static synchronized LazySaftySingleton getLazySingleton() {
        if (mLazySaftySingleton == null) {
            mLazySaftySingleton = new LazySaftySingleton();
            return mLazySaftySingleton;
        }
        return mLazySaftySingleton;
    }
}
