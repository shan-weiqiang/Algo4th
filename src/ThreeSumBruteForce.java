
import edu.princeton.cs.algs4.In;

public class ThreeSumBruteForce {
    public static int count(int[] a) {
        int len = a.length;
        int cnt = 0;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                for (int k = j + 1; k < len; k++) {
                    if (a[i] + a[j] + a[k] == 0) {
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        int a[] = new In(args[0]).readAllInts();
        System.out.println(count(a));
    }
}
