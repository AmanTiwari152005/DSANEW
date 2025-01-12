//leetcode question 1351(easy)
public class CountNegative {
    public static void main(String[] args) {
        CountNegative c=new CountNegative();
        int [][] grid={{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        int ans=c.countNegatives(grid);
        System.out.println(ans);
    }
    public int countNegatives(int[][] grid) {
        int count = 0;

        // Iterate through each row
        for (int[] row : grid) {
            count += countNegativesInRow(row);
        }

        return count;
    }

    public static int countNegativesInRow(int[] row) {
        int left = 0, right = row.length;

        // Perform binary search
        while (left < right) {
            int mid = left + (right - left) / 2;

            if (row[mid] < 0) {
                right = mid;  // Look for smaller indices
            } else {
                left = mid + 1;  // Look for larger indices
            }
        }

        // Number of negatives is the total elements minus the index of the first negative
        return row.length - left;
    }
}
