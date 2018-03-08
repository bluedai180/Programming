package composite;

/**
 * Created by Blue on 2018/3/6.
 */
public class TextFile extends File {
    public TextFile(String name) {
        super(name);
    }

    @Override
    public void watch() {
        System.out.println(getName() + "文本文件");
    }
}
