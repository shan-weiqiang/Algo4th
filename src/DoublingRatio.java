
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.Stopwatch;
import edu.princeton.cs.algs4.StdRandom;

public class DoublingRatio {
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
        double prev = timeTrail(125);
        for (int N = 250; true; N += N) {
            double curr = timeTrail(N);
            StdOut.printf("%7d %7.2f", N, curr);
            StdOut.printf("%7.1f\n", curr / prev);
            prev = curr;
        }
    }
}
