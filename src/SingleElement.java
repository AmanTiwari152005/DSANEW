//leetcode question  number 540(medium)
public class SingleElement {
    public int singleNonDuplicate(int[] nums) {
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // Check if mid is on the correct half
            boolean isLeftHalf = (mid % 2 == 0 && nums[mid] == nums[mid + 1]) ||
                    (mid % 2 == 1 && nums[mid] == nums[mid - 1]);

            if (isLeftHalf) {
                left = mid + 1; // Unique element is in the right half
            } else {
                right = mid; // Unique element is in the left half or at mid
            }
        }

        return nums[left]; // The left pointer will point to the unique element
    }

    public static void main(String[] args) {
        SingleElement solution = new SingleElement();

        int[] nums1 = {1, 1, 2, 3, 3, 4, 4, 8, 8};
        int[] nums2 = {3, 3, 7, 7, 10, 11, 11};

        System.out.println(solution.singleNonDuplicate(nums1));
        System.out.println(solution.singleNonDuplicate(nums2));
    }
}
