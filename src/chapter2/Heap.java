package chapter2;

/**
 * Created by Blue on 2017/6/11.
 */
public class Heap {

    public static void sort(Comparable[] a) {
        int N = a.length - 1;
        for (int k = N / 2; k >= 1; k--) {
            sink(a, k, N);
        }
        while (N > 1) {
            exch(a, 1, N--);
            sink(a, 1, N);
        }
    }

    public static void sink(Comparable[] a, int k, int n) {
        while (2 * k <= n) {
            int j = 2 * k;
            if (j < n && less(a[j], a[j + 1])) j++;
            if (!less(a[k], a[j])) break;
            exch(a, k, j);
            k = j;
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

    public static void show(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String[] a = {" ", "80", "30", "60", "40", "20", "10", "50", "70"};
        show(a);
        sort(a);
        show(a);
    }
}
