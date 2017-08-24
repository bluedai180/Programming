package chapter9;

/**
 * Created by Blue on 2017/8/23.
 */

interface Instrument {
    int VALUE = 5;

    void adjust();
}

interface Playable {
    void play();
}

class Wind implements Instrument, Playable {

    public void adjust() {

    }

    public void play() {
        System.out.println("Wind play");
    }
}

class Percussion implements Instrument, Playable {
    public void adjust() {

    }

    public void play() {
        System.out.println("Percussion play");
    }
}

class Stringed implements Instrument, Playable {
    public void adjust() {

    }

    public void play() {
        System.out.println("Stringed play");
    }
}

public class Exercise10 {

    static void tune(Playable p) {
        p.play();
    }

    static void tuneAll(Playable[] playables) {
        for (Playable playable : playables) {
            tune(playable);
        }
    }

    public static void main(String[] args) {
        Playable[] playables = {new Wind(), new Percussion(), new Stringed()};
        tuneAll(playables);
    }

}
