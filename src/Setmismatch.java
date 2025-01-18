//leetcode question number 645(easy)
import java.util.Arrays;
public class Setmismatch {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 4};
        int[] result = findErrorNums(nums);
        System.out.println("Result: " + Arrays.toString(result));
    }

    public static int[] findErrorNums(int[] nums) {
        int i = 0;

        // Cyclic Sort to place elements in their correct positions
        while (i < nums.length) {
            int correctIndex = nums[i] - 1; // Map the value to the correct index
            if (nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }

        // After sorting, find the mismatch
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                // Duplicate: nums[index], Missing: index + 1
                return new int[]{nums[index], index + 1};
            }
        }

        // Default return (should never reach here for valid inputs)
        return new int[]{-1, -1};
    }

     static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
