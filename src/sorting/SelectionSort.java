package sorting;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

public class SelectionSort<T extends Comparable<T>> extends SortBase<T> {
    public void sort(T[] a) {
        for (int i = 0; i < a.length; i++) {
            int tmp = i;
            for (int j = i + 1; j < a.length; j++) {
                if (less(a[j], a[tmp]))
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
        SelectionSort<Integer> sort = new SelectionSort<Integer>();
        sort.sort(a);
        sort.show(a);
    }
}
