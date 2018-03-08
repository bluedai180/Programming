package composite;

/**
 * Created by Blue on 2018/3/6.
 */
public class Client {
    public static void main(String[] args){
        TextFile textFileA = new TextFile("a.txt");
        TextFile textFileB = new TextFile("b.txt");
        TextFile textFileC = new TextFile("c.txt");
        textFileA.watch();
        Folder folder = new Folder("学习资料");
        folder.add(textFileA);
        folder.add(textFileB);
        folder.add(textFileC);
        folder.watch();
        folder.getChild(1).watch();
    }
}
