package chapter5;

/**
 * Created by Blue on 2017/8/29.
 */
class WebBank1 {
    boolean loggedIn = false;

    WebBank1(boolean logStatus) {
        loggedIn = logStatus;
    }

    void logIn() {
        loggedIn = true;
    }

    void logOut() {
        loggedIn = false;
    }

    protected void finalize() {
        if (loggedIn)
            System.out.println("Error: still logged in");
        try {
            super.finalize();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}

public class Exercise11 {
    public static void main(String[] args) {
        WebBank1 bank1 = new WebBank1(true);
        WebBank1 bank2 = new WebBank1(true);
        new WebBank1(true);
        // Proper cleanup: log out of bank1 before going home:
        bank1.logOut();
        // Forget to logout of bank2 and unnamed new bank
        // Attempts to finalize any missed banks:
        System.out.println("Try 1: ");
        System.runFinalization();
        System.out.println("Try 2: ");
        Runtime.getRuntime().runFinalization();
        System.out.println("Try 3: ");
        System.gc();
        System.out.println("Try 4: ");
        // using deprecated since 1.1 method:
        System.runFinalizersOnExit(true);
    }
}
