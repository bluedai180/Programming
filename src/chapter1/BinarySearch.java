package chapter1;

import java.util.Arrays;

public class BinarySearch {
    private static int[] source = {3, 9, 5, 2, 7 ,3, 6, 0};
    private static int key = 7;

    private static int Search(int[] a, int mid) {
        int length = a.length;
        if (a[mid] == key) {
            return a[mid];
        } else if (a[mid] > key) {
            mid = (length - mid) / 2;
            return Search(a, mid);
        } else if (a[mid] < key) {
            mid = (length - mid) / 2 + mid;
            return Search(a, mid);
        }
        return -1;
    }

    public static void main(String[] args) {
        Arrays.sort(BinarySearch.source);
        int result = Search(BinarySearch.source, BinarySearch.source.length / 2);
        System.out.print(result);
    }
}
