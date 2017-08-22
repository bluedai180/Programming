package chapter9;

/**
 * Created by Blue on 2017/8/1.
 */
public class Exercise1 {

    abstract class Rodent {
        public abstract void eat();
    }

    class Mouse extends Rodent{

        public void eat() {
            System.out.println("Mouse eat");
        }
    }

    class Gerbil extends Rodent{

        public void eat() {
            System.out.println("Gerbil eat");
        }
    }

    class Hamster extends Rodent{

        public void eat() {
            System.out.println("Hamster eat");
        }
    }

    public static void main(String[] args) {
        Exercise1 exercise1 = new Exercise1();
        Rodent[] rodent = {exercise1.new Mouse(), exercise1.new Gerbil(), exercise1.new Hamster()};
        for (int i = 0; i < rodent.length; i++) {
            rodent[i].eat();
        }
    }
}
