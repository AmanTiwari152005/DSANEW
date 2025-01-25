//leetcode question number 1636(easy)
import java.util.Arrays;

public class Sortbyfrequencies {
    public int[] frequencySort(int[] nums) {
        int n = nums.length;


        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                int freqI = countFrequency(nums, nums[i]);
                int freqJ = countFrequency(nums, nums[j]);


                if (freqI > freqJ || (freqI == freqJ && nums[i] < nums[j])) {

                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        return nums;
    }


    private int countFrequency(int[] nums, int target) {
        int count = 0;
        for (int num : nums) {
            if (num == target) {
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        Sortbyfrequencies sol = new Sortbyfrequencies();
        int[] nums = {1, 1, 2, 2, 2, 3};
        int[] sortedNums = sol.frequencySort(nums);
        System.out.println(Arrays.toString(sortedNums));
    }

}
