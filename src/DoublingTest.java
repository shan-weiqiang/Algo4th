
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.Stopwatch;;

public class DoublingTest {

    public static double timeTrail(int N) {
        int MAX = 1000000;
        int a[] = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = StdRandom.uniformInt(-MAX, MAX);
        }
        Stopwatch timer = new Stopwatch();
        ThreeSumBruteForce.count(a);
        return timer.elapsedTime();
    }

    public static void main(String[] args) {
        for (int N = 250; true; N += N) {
            StdOut.printf("%7d %5.1f\n", N, timeTrail(N));
        }
    }

}
