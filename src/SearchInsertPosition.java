//leetcode question number 35(easy)
public class SearchInsertPosition {
    public static void main(String[] args) {
        SearchInsertPosition s=new SearchInsertPosition();

        int []nums={1,5,6,8};
        int ans=s.searchInsert(nums,4);
        System.out.println(ans);
    }
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;  // Target found.
            }

            if (nums[mid] < target) {
                start = mid + 1;  // Move to the right half.
            } else {
                end = mid - 1;  // Move to the left half.
            }
        }

        return start;  // Start is the insert position.
    }
}

