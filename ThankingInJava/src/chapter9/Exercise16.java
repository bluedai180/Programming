package chapter9;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Scanner;

/**
 * Created by Blue on 2017/8/24.
 */

class GetChar{
    private static final char[] test = "BlueDai".toCharArray();
    private int length = test.length;
    int i = -1;
    public char getNextChar() {
        i += 1;
        return test[i];
    }
}

class AdaptedChar extends GetChar implements Readable {
    private int count;
    public AdaptedChar (int count) {
        this.count = count;
    }
    public int read(CharBuffer cb) throws IOException {
        if (count-- == 0) {
            return -1;
        }
        String result = Character.toString(getNextChar());
        cb.append(result);
        return result.length();
    }
}

public class Exercise16{

    public static void main(String[] args) {
        AdaptedChar adaptedChar = new AdaptedChar(7);
        Scanner scanner = new Scanner(adaptedChar);
        while (scanner.hasNext()) {
            System.out.print(scanner.next());
        }
    }
}
