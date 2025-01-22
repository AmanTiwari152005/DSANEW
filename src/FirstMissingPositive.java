//leetcode question number 41(hard)
import java.util.Scanner;

class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        int i = 0;

        // Step 1: Place each number in its correct position
        while (i < n) {
            int correct = nums[i] - 1; // Expected index for nums[i]
            if (nums[i] > 0 && nums[i] <= n && nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        // Step 2: Find the first missing positive
        for (int index = 0; index < n; index++) {
            if (nums[index] != index + 1) {
                return index + 1;
            }
        }

        // Step 3: If all numbers are in correct positions, return n + 1
        return n + 1;
    }

    // Utility function to swap two elements in the array
    void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Input array elements
        int[] nums = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
        }

        // Create an instance of Solution and call the method
        FirstMissingPositive solution = new FirstMissingPositive();
        int result = solution.firstMissingPositive(nums);

        // Output the result
        System.out.println("The first missing positive integer is: " + result);

        scanner.close();
    }
}

