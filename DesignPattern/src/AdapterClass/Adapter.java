package AdapterClass;

/**
 * Created by Blue on 2018/3/5.
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void sampleOperation2() {
        System.out.println("adapter sampleOperation2");
    }
}
