package chapter9;

/**
 * Created by Blue on 2017/8/1.
 */
public class Exercise3 {
    abstract class Base {
        public Base() {
            print();
        }

        abstract void print();
    }

    class Out extends Base {
        int i = 1;

        void print() {
            System.out.println("Out print i = " + i);
        }
    }

    public static void main(String[] args) {
        Exercise3 exercise3 = new Exercise3();
        Out out = exercise3.new Out();
        out.print();
    }
}
