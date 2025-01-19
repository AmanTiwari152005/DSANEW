public class MaximumPairs {
    public int[] numberOfPairs(int[] nums) {
            // Create a frequency array to count occurrences of each number
            int[] frequency = new int[101]; // Assuming nums[i] is in the range [0, 100]

            // Count the frequency of each number in the array
            for (int num : nums) {
                frequency[num]++;
            }

            int pairs = 0, leftovers = 0;

            // Calculate pairs and leftovers using the frequency array
            for (int count : frequency) {
                pairs += count / 2;      // Number of pairs
                leftovers += count % 2; // Number of leftover elements
            }

            return new int[] {pairs, leftovers};
        }

        public static void main(String[] args) {
            MaximumPairs solution = new MaximumPairs();
            int[] nums = {1, 3, 2, 1, 3, 2, 2};
            int[] result = solution.numberOfPairs(nums);

            System.out.println("Pairs: " + result[0] + ", Leftovers: " + result[1]);
        }
    }


