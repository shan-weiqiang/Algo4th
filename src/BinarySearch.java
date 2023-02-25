
import java.util.Arrays;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class BinarySearch {

    // 二分查找算法分析：
    // 1. 输入模型是N个元素的数组，输入参数是N
    // 2. 内循环：是while的查找循环
    // 3. 内循环中的成本模型：循环中只有一次数组的访问，否则return
    // 4.
    // 分析：针对一个N，最多需要log(N)+1次数组访问，基数是2；
    // 直观上证明就是N扩大一倍，只需要多一次查找就可以到达N/2，
    // 也就是N每扩大一倍，查找次数才会增加一次
    // 数学上的严格证明更为复杂，此处不写；
    // 所以，二分法查找的程序耗时是N的对数，随N成对数级增长
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
        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            if (rank(key, whitelist) == -1) {
                StdOut.println(key);
            }
        }
    }
}
