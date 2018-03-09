package decorator;

/**
 * Created by Blue on 2018/3/5.
 */
public class Decorator implements Component {
    public Decorator() {}

    public Decorator(Component component){
        component.operation();
    }

    @Override
    public void operation() {
        System.out.println("原始类方法");
    }
}
