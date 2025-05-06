public class SetBitsa {
    public static void main(String[] args) {
        int n = 15;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(setbits(n));
    }

    public static int setbits(int n) {
        int count = 0;
        while(n > 0) {
            if((n & 1) == 1) { // Check if LSB is set
                count++;
            }
            n = n >> 1; // Shift right to check next bit
        }
        return count;
    }
}
