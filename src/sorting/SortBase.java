package sorting;

import edu.princeton.cs.algs4.StdOut;

public class SortBase<T extends Comparable<T>> {
    protected boolean less(T a, T b) {
        return a.compareTo(b) < 0;
    }

    protected void exch(T[] a, int i, int j) {
        T tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    public void show(T[] a) {
        for (int i = 0; i < a.length; i++) {
            StdOut.print(a[i] + " ");
        }
        StdOut.println();
    }

    public boolean isSorted(T[] a) {
        for (int i = 1; i < a.length; i++) {
            if (less(a[i], a[i - 1]))
                return false;
        }
        return true;
    }
}
