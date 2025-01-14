//leetcode question number 1608(easy)
import java.util.Arrays;

public class SpecialArray {
    public static void main(String[] args) {
        int []nums={3,5,0,1,3};
        specialarray(nums);
        System.out.println(Arrays.toString(nums));

    }
    public static int specialarray(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int left = 0, right = n; // Step 2: Define the range for binary search

        while (left <= right) {
            int mid = (left + right) / 2; // Find the midpoint
            // Step 3: Count elements >= mid
            int count = 0;
            for (int num : nums) {
                if (num >= mid) {
                    count++;
                }
            }

            if (count == mid) { // If the count matches mid, we've found the answer
                return mid;
            } else if (count > mid) { // If count > mid, move left pointer to find a larger x
                left = mid + 1;
            } else { // If count < mid, move right pointer to find a smaller x
                right = mid - 1;
            }
        }

        return -1; // No valid x found
    }
}
