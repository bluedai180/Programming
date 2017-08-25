package chapter9;


/**
 * Created by Blue on 2017/8/23.
 */
interface Processor {
    String name();

    String process(String input);
}

class Apply {
    static void process(Processor p, Object s) {
        System.out.println("Using Processor " + p.name());
        System.out.println(p.process((String) s));
    }
}

class Executor implements Processor {

    public String name() {
        return "Exercise11";
    }

    public String process(String input) {
        return String.valueOf(input.toCharArray()[1]) + String.valueOf(input.toCharArray()[0]);
    }
}

public class Exercise11 {
    public static void main(String[] args) {
        Executor executor = new Executor();
        Apply.process(executor, "HI");
    }
}
