//leetcode question number 888(easy)
    import java.util.Arrays;

    public class FairCandySwap {
        public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
            // Calculate the total sums of both arrays using traditional for loops
            int sumA = 0, sumB = 0;
            for (int i = 0; i < aliceSizes.length; i++) {
                sumA += aliceSizes[i];
            }
            for (int i = 0; i < bobSizes.length; i++) {
                sumB += bobSizes[i];
            }

            // Calculate the target difference (delta)
            int delta = (sumA - sumB) / 2;

            // Sort Bob's array for binary search
            Arrays.sort(bobSizes);

            // Iterate through Alice's array using a traditional for loop
            for (int i = 0; i < aliceSizes.length; i++) {
                int candy = aliceSizes[i];
                int target = candy - delta;
                // Perform binary search for the target in Bob's array
                if (binarySearch(bobSizes, target)) {
                    return new int[]{candy, target};
                }
            }
            // Return an empty array if no valid pair is found (not expected as per the problem)
            return new int[0];
        }

        // Helper method for binary search
        private boolean binarySearch(int[] arr, int target) {
            int left = 0, right = arr.length - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (arr[mid] == target) {
                    return true;
                } else if (arr[mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            return false;
        }

        public static void main(String[] args) {
            FairCandySwap solution = new FairCandySwap();

            int[] aliceSizes = {1, 2, 5};
            int[] bobSizes = {2, 4};

            int[] result = solution.fairCandySwap(aliceSizes, bobSizes);
            System.out.println(Arrays.toString(result)); // Output: [5, 4]
        }
    }


