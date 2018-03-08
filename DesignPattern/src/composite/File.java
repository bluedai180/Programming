package composite;

/**
 * Created by Blue on 2018/3/6.
 */
public abstract class File {
    private String name;

    public File(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void watch();

    public void add(File file) {
        throw new UnsupportedOperationException();
    }

    public void remove(File file) {
        throw new UnsupportedOperationException();
    }

    public File getChild(int pos) {
        throw new UnsupportedOperationException();
    }
}
