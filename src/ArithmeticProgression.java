//leetcode question number 1502(easy)
import java.util.Arrays;

public class ArithmeticProgression {

    // Method to check if the array can form an arithmetic progression
    public boolean canMakeArithmeticProgression(int[] arr) {
        // Step 1: Sort the array
        Arrays.sort(arr);

        // Step 2: Calculate the common difference
        int diff = arr[1] - arr[0];

        // Step 3: Check the difference for all consecutive elements
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] != diff) {
                return false;
            }
        }

        return true;
    }

    // Main function to test the implementation
    public static void main(String[] args) {
        ArithmeticProgression ap = new ArithmeticProgression();

        // Example inputs to test
        int[] arr1 = {3, 5, 1};
        int[] arr2 = {1, 2, 4};

        // Check if the arrays can form an arithmetic progression
        System.out.println("Can arr1 form an arithmetic progression? " + ap.canMakeArithmeticProgression(arr1)); // Output: true
        System.out.println("Can arr2 form an arithmetic progression? " + ap.canMakeArithmeticProgression(arr2)); // Output: false
    }
}
