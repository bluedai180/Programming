package AdapterObject;


/**
 * Created by Blue on 2018/3/5.
 */
public class Test {
    public static void main(String[] args) {
        Adapter adapter = new Adapter(new Adaptee());
        adapter.sampleOperation1();
        adapter.sampleOperation2();
    }
}
