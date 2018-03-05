package singleton;

/**
 * Created by Blue on 2018/3/5.
 */
public class LazySingleton {
    private static LazySingleton mLazySingleton = null;
    private LazySingleton() {

    }
    public static LazySingleton getLazySingleton() {
        if (mLazySingleton == null) {
            mLazySingleton = new LazySingleton();
            return mLazySingleton;
        }
        return mLazySingleton;
    }
}
