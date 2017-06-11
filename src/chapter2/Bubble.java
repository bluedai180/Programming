package chapter2;

/**
 * Created by Blue on 2017/6/11.
 */
public class Bubble {

    public static void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N - i - 1; j++) {
                if (!less(a[j], a[j + 1])) {
                    exch(a, j, j + 1);
                }
            }
        }
    }

    public static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    public static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static boolean isSorted(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            if (less(a[i], a[i - 1])) {
                return false;
            }
        }
        return true;
    }

    public static void show(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String[] a = {"80", "30", "60", "40", "20", "10", "50", "70"};
        sort(a);
        assert isSorted(a);
        show(a);
    }
}
