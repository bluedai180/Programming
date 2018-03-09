package decorator;

/**
 * Created by Blue on 2018/3/5.
 */
public class ConcreateDecorator extends Decorator {
    private Decorator decorator;

    public ConcreateDecorator(Component component) {
        super(component);
    }

    public ConcreateDecorator() {
        super();
    }

    @Override
    public void operation() {
        super.operation();
        System.out.println("装饰器方法");
    }
}
