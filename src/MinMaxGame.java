public class MinMaxGame {
    public int minMaxGame(int[] nums) {
        // Continue reducing the array until it has one element
        while (nums.length > 1) {
            int n = nums.length / 2;  // Size of new array
            int[] newNums = new int[n];  // Temporary array
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    newNums[i] = Math.min(nums[2 * i], nums[2 * i + 1]);
                } else {
                    newNums[i] = Math.max(nums[2 * i], nums[2 * i + 1]);
                }
            }
            nums = newNums;  // Update nums to point to the reduced array
        }
        return nums[0];  // Return the last element
    }

    public static void main(String[] args) {
        MinMaxGame game = new MinMaxGame();
        int[] nums = {1, 3, 5, 2, 4, 8, 2, 2};
        System.out.println("The last remaining number is: " + game.minMaxGame(nums));
    }
}
