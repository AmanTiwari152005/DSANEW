//leetcode question number 69(easy)
public class squareroot {
    public static void main(String[] args) {
        squareroot s=new squareroot();
        int ans=s.mySqrt(4);
        System.out.println(ans);
    }
    public int mySqrt(int x) {
        if (x == 0) return 0;  // Handle x = 0 explicitly.

        int start = 0;
        int end = x;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid == 0) {  // Avoid division by zero.
                start = mid + 1;
                continue;
            }

            int div = x / mid;  // Avoid overflow by dividing instead of multiplying.

            if (div == mid) {
                return mid;  // Exact square root found.
            }
            if (div < mid) {
                end = mid - 1;  // Mid is too large.
            } else {
                start = mid + 1;  // Mid is too small.
            }
        }

        return end;  // End holds the truncated integer part of sqrt(x).
    }
}
