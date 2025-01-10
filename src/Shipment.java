//leetcode problem number 1011(medium)
public class Shipment {
    public static void main(String[] args) {
        Shipment s=new Shipment();
        int [] weights={1,2,3,4,5,6,7,8,9,10};
        int ans=s.shipWithinDays(weights,5);
        System.out.println(ans);
    }
    public int shipWithinDays(int[] weights, int D) {
        // Determine the range for binary search
        int left = 0, right = 0;
        for (int i = 0; i < weights.length; i++) {
            left = Math.max(left, weights[i]); // Minimum capacity is the heaviest package
            right += weights[i];              // Maximum capacity is the sum of all weights
        }

        // Perform binary search
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canShip(weights, D, mid)) {
                right = mid; // Try a smaller capacity
            } else {
                left = mid + 1; // Increase capacity
            }
        }
        return left; // Minimum capacity to ship within D days
    }

    private boolean canShip(int[] weights, int D, int capacity) {
        int days = 1; // Start with the first day
        int currentWeight = 0;

        for (int i = 0; i < weights.length; i++) {
            if (currentWeight + weights[i] > capacity) {
                days++; // Use a new day
                currentWeight = 0;
            }
            currentWeight += weights[i];

            if (days > D) {
                return false; // Too many days needed
            }
        }
        return true; // Shipment is possible within D days
    }
}
