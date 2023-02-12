package BinarySearch;

import java.util.Arrays;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class BinarySearch {

    public static int rank(int key, int[] data) {
        int lo = 0;
        int hi = data.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < data[mid]) {
                hi = mid - 1;
            } else if (key > data[mid]) {
                lo = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] whitelist = new In(args[0]).readAllInts();
        Arrays.sort(whitelist);
        while(!StdIn.isEmpty()){
            int key = StdIn.readInt();
            if(rank(key, whitelist) == -1){
                StdOut.println(key);
            }
        }
    }

}


