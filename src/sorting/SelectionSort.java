package sorting;

import edu.princeton.cs.algs4.In;

public class SelectionSort extends SortBase {
    public static void sort(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            int tmp = i;
            for (int j = i + 1; j < a.length; j++) {
                if (less(a[j], a[i]))
                    tmp = j;
            }
            exch(a, i, tmp);
        }

    }

    public static void main(String[] args) {
        String[] s = new In(args[0]).readAllStrings();
        Integer[] a = new Integer[s.length];
        for (int i = 0; i < s.length; i++) {
            a[i] = Integer.parseInt(s[i]);
        }
        sort(a);
        assert isSorted(a);
        show(a);
    }
}
