package chapter9;

/**
 * Created by Blue on 2017/8/24.
 */

interface Fly {
    void canFly();
}

interface Eat extends Fly {
    void canEat();
}

interface Drink extends Fly {
    void canDrink();
}

interface DoAll extends Fly, Eat, Drink {
    void canDoAll();
}

class Animal {
    public void canDoAll() {
        System.out.println("Animal can do all");
    }
}

class Bird extends Animal implements DoAll {

    public void canFly() {

    }

    public void canEat() {

    }

    public void canDrink() {

    }

    public void canDoAll() {
        System.out.println("Bird can do all");
    }
}

public class Exercise13 {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Animal animal = new Animal();
//        bird.canDoAll();
//        ((Drink) bird).canDrink();
        bird.canDoAll();
        ((Animal) bird).canDoAll();
    }
}
