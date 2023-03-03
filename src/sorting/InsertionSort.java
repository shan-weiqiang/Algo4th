package sorting;

import edu.princeton.cs.algs4.In;

public class InsertionSort<T extends Comparable<T>> extends SortBase<T> {

    public void sort(T[] a) {
        for (int i = 1; i < a.length; i++) {
            int tmp = i;
            while (tmp > 0 && less(a[tmp], a[tmp - 1])) {
                exch(a, tmp - 1, tmp);
                tmp--;
            }

        }
    }

    public static void main(String[] args) {
        String s[] = new In(args[0]).readAllStrings();
        Integer a[] = new Integer[s.length];
        for (int i = 0; i < s.length; i++) {
            a[i] = Integer.parseInt(s[i]);
        }

        InsertionSort<Integer> sort_int = new InsertionSort<>();
        sort_int.show(a);
        sort_int.sort(a);
        sort_int.show(a);
    }

}
