package chapter9;

/**
 * Created by Blue on 2017/8/22.
 */
abstract class Base {

}

class Subclass extends Base {
    static void export() {
        System.out.println("This is Subclass export");
    }
}

abstract class Base2 {
    abstract void export();
}

class Subclass2 extends Base2 {

    void export() {
        System.out.println("This is Subclass2 export");
    }
}

public class Exercise4 {
    public static void testExport(Base base) {
        ((Subclass) base).export();
    }
    public static void testExport2(Base2 base2) {
        base2.export();
    }
    public static void main(String[] args) {
        Subclass sub1 = new Subclass();
        Subclass2 sub2 = new Subclass2();
        testExport(sub1);
        testExport2(sub2);
    }
}


