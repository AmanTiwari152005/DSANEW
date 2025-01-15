//leetcode question number 2206(easy)
import java.util.Arrays;

public class DivideArray {
    public boolean divideArray(int[] nums) {
        // Sort the array
        Arrays.sort(nums);

        // Check pairs of numbers
        for (int i = 0; i < nums.length; i += 2) {
            if (nums[i] != nums[i + 1]) {
                return false; // If a pair is not equal, return false
            }
        }

        // All pairs are equal
        return true;
    }

    public static void main(String[] args) {
        DivideArray obj = new DivideArray();

        // Test case 1
        int[] nums1 = {3, 2, 3, 2, 2, 2};
        System.out.println(obj.divideArray(nums1)); // Expected
    }
}