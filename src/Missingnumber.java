/*leetcode question number 268(easy).....Asked in amazon...*/
import java.util.Arrays;

class Missingnumber {
    public static void main(String[] args) {
        int[] nums = {3, 0, 1};
        int missing = missingNumber(nums);  // Capture the missing number
        System.out.println("Missing number: " + missing);  // Print the missing number
    }

    public static int missingNumber(int[] nums) {
        int i = 0;

        while (i < nums.length) {
            int correct = nums[i];
            if (nums[i] < nums.length && nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        for (int index = 0; index < nums.length; index++) {
            // Case 1: Missing number is within the range [0, n-1]
            if (nums[index] != index) {
                return index;
            }
        }

        // Case 2: Missing number is n
        return nums.length;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
