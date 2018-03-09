package facade;

public class Facade {
    private Module1 module1 = null;
    private Module2 module2 = null;
    private Module3 module3 = null;
    private static Facade facade = null;

    private Facade() {
        module1 = new Module1();
        module2 = new Module2();
        module3 = new Module3();
    }

    public static Facade getFacade() {
        if (facade == null) {
            facade = new Facade();
        }
        return facade;
    }

    public void testOperation() {
        module1.testFunctionA();
        module2.testFunctionB();
        module3.testFunctionC();
    }
}
