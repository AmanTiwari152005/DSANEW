
//leetcode question number 167(medium)
public class TwoSum2 {
    public int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            int complement = target - numbers[i];
            int index = binarySearch(numbers, i + 1, numbers.length - 1, complement);
            if (index != -1) {
                return new int[] { i + 1, index + 1 }; // Return one-based indices
            }
        }
        return new int[] {}; // Return empty if no solution (problem guarantees one solution)
    }

    private int binarySearch(int[] numbers, int left, int right, int target) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (numbers[mid] == target) {
                return mid;
            } else if (numbers[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; // Target not found
    }

    public static void main(String[] args) {
        TwoSum2 solution = new TwoSum2();
        int[] numbers = { 2, 7, 11, 15 };
        int target = 9;
        int[] result = solution.twoSum(numbers, target);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}
