package singleton;

/**
 * Created by Blue on 2018/3/5.
 */

class Resource {
}

public enum EnumSingleton {
    INSTANCE;
    private Resource instance;

    private EnumSingleton() {
        instance = new Resource();
    }

    public Resource getInstance() {
        return instance;
    }

}
