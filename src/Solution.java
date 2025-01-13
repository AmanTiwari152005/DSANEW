//leetcode question  number 1346(easy)
class Solution {
    // Method to check if any element is double of another
    public boolean checkIfExist(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                // Ensure indices are different and check the condition
                if (i != j && arr[i] == 2 * arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }


    public static void main(String[] args) {
        // Create an object of the Solution class
        Solution solution = new Solution();

        // Example test cases
        int[] test1 = {10, 2, 5, 3};
        int[] test2 = {7, 1, 14, 11};
        int[] test3 = {3, 1, 7, 11};
        int[] test4 = {0, 0}; // Edge case with zeroes

        // Call the checkIfExist method and print the results
        System.out.println("Test 1: " + solution.checkIfExist(test1)); // Output: true
        System.out.println("Test 2: " + solution.checkIfExist(test2)); // Output: true
        System.out.println("Test 3: " + solution.checkIfExist(test3)); // Output: false
        System.out.println("Test 4: " + solution.checkIfExist(test4)); // Output: true
    }
}

