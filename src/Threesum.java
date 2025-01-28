//leetcode question number 15(medium)
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Threesum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums); // Step 1: Sort the array

        int n = nums.length;

        for (int i = 0; i < n - 2; i++) { // First loop
            // Skip duplicates for the first number
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            for (int j = i + 1; j < n - 1; j++) { // Second loop
                // Skip duplicates for the second number
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }

                for (int k = j + 1; k < n; k++) { // Third loop
                    // Skip duplicates for the third number
                    if (k > j + 1 && nums[k] == nums[k - 1]) {
                        continue;
                    }

                    if (nums[i] + nums[j] + nums[k] == 0) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    }
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> triplets = threeSum(nums);
        System.out.println(triplets);
    }
}
