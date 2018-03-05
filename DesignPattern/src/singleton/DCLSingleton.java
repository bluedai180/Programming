package singleton;

/**
 * Created by Blue on 2018/3/5.
 */
public class DCLSingleton {
    // jvm指令重排序优化，使用volatile禁止jvm指令重排序优化
    private static volatile DCLSingleton mInstance = null;

    private DCLSingleton() {

    }

    public static DCLSingleton getInstance() {
        // 避免不必要的同步
        if (mInstance == null) {
            // 同步方法
            synchronized (DCLSingleton.class) {
                // 在第一次时同步初始化
                if (mInstance == null) {
                    mInstance = new DCLSingleton();
                }
            }
        }
        return mInstance;
    }
}
