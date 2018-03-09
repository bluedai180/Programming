package decorator;

/**
 * Created by Blue on 2018/3/8.
 */
public class Client {
    public static void main(String[] args) {
        Decorator decorator = new Decorator(new ConcreateDecorator());
    }
}
