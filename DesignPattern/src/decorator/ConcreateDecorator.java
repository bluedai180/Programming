package decorator;

/**
 * Created by Blue on 2018/3/5.
 */
public class ConcreateDecorator extends Decorator {
    public ConcreateDecorator(Component component) {
        super(component);
    }

    public void operation() {
        super.operation();
        addBehavior();
    }

    public void addBehavior() {
    }
}
