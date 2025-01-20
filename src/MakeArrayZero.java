//leetcode question number 2357(easy)
public class MakeArrayZero {
    public int minimumOperations(int[] nums) {
        int operations = 0;

        while (true) {
            // Find the smallest non-zero element in the array
            int min = Integer.MAX_VALUE;
            for (int num : nums) {
                if (num > 0 && num < min) {
                    min = num;
                }
            }

            // If no non-zero element is found, we are done
            if (min == Integer.MAX_VALUE) {
                break;
            }

            // Subtract the smallest non-zero element from all non-zero elements
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > 0) {
                    nums[i] -= min;
                }
            }

            // Increment the operation count
            operations++;
        }

        return operations;
    }

    public static void main(String[] args) {
        MakeArrayZero solution = new MakeArrayZero();
        int[] nums = {3, 4, 2, 6, 0};
        System.out.println("Minimum operations: " + solution.minimumOperations(nums)); // Output: 3
    }
}
