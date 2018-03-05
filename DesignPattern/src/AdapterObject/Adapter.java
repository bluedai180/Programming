package AdapterObject;

import AdapterClass.*;
import AdapterClass.Adaptee;

/**
 * Created by Blue on 2018/3/5.
 */
public class Adapter implements AdapterClass.Target {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void sampleOperation1() {
        adaptee.sampleOperation1();
    }

    @Override
    public void sampleOperation2() {
        System.out.println("Adapter sampleOperation2");
    }
}
