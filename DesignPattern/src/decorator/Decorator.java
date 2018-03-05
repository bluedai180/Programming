package decorator;

/**
 * Created by Blue on 2018/3/5.
 */
public class Decorator implements Component {

    private Component component;
    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }
}
