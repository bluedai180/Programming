package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Blue on 2018/3/6.
 */
public class Folder extends File {
    private List<File> files;

    public Folder(String name) {
        super(name);
        files = new ArrayList<File>();
    }

    @Override
    public void watch() {
        StringBuffer fileName = new StringBuffer();
        for (File file : files) {
            fileName.append(file.getName() + ":");
        }
        System.out.println(getName() + "文件夹, " + files.size() + "个文件, " + fileName);
    }

    @Override
    public void add(File file) {
        files.add(file);
    }

    @Override
    public void remove(File file) {
        files.remove(file);
    }

    @Override
    public File getChild(int pos) {
        return files.get(pos);
    }
}
