package chapter5;

/**
 * Created by Blue on 2017/8/29.
 */
class WebBank {
    boolean loggedIn = false;

    WebBank(boolean logStatus) {
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

public class Exercise10 {
    public static void main(String[] args) {
        WebBank bank1 = new WebBank(true);
        WebBank bank2 = new WebBank(true);
        bank1.logOut();
        new WebBank(true);
        System.gc();
    }
}
