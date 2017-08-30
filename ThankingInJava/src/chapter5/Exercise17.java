package chapter5;

/**
 * Created by Blue on 2017/8/30.
 */
class InitTest {
    InitTest(String s) {
        System.out.println("InitTest()");
        System.out.println(s);
    }
}

public class Exercise17 {
    public static void main(String[] args) {
        InitTest[] it = new InitTest[10];
    }
}
