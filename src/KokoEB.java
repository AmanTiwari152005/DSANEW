//leetcode question number 875(medium)
public class KokoEB {
    public static void main(String[] args) {
        KokoEB k=new KokoEB();
        int []piles={3,6,7,11};
        int ans=k.minEatingSpeed(piles,8);
        System.out.println(ans);
    }
    public int minEatingSpeed(int[] piles, int h) {
        int start = 1;
        int end = 0;
        for (int i = 0; i < piles.length; i++) {
            end = Math.max(end, piles[i]);
        }

        while (start <= end) {
            int k = start + (end - start) / 2;

            if (totaltime(piles, k) <= h) {
                end = k - 1;
            } else {
                start = k + 1;
            }
        }
        return start;
    }

    public long totaltime(int[] piles, int k) { // Corrected: Return type is long
        long tt = 0; // Corrected: tt is long
        for (int i = 0; i < piles.length; i++) {
            tt += (long)Math.ceil((double)piles[i] / k); // Corrected: Cast to long after ceil
        }
        return tt;
    }
}
