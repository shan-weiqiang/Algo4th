import java.util.Arrays;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

public class ThreeSumFast {
    public static int  count(int[] a){
        Arrays.sort(a);
        int cnt =0;
        int N = a.length;
        for(int i =0;i < N;i++){
            for(int j=i+1;j<N;j++){
                if(BinarySearch.rank(-a[i]-a[j], a)>j){
                    cnt++;
                }
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        int[] a = new In(args[0]).readAllInts();
        StdOut.println(count(a));
    }
}
