package builder;

/**
 * Created by Blue on 2018/3/5.
 */
public class BuilderClient {
    public static void main(String[] args) {
        Builder builder = new ConcreateBuilder();
        Director director = new Director(builder);
        Product product = director.construct();
    }
}
