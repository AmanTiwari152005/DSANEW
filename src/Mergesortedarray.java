//leetcode question number 88(easy)
import java.util.Arrays;
import java.util.Scanner;

class Mergesortedarray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] mergedarray = new int[m + n];

        for (int i = 0; i < m; i++) {
            mergedarray[i] = nums1[i];
        }

        for (int j = 0; j < n; j++) {
            mergedarray[m + j] = nums2[j];
        }

        Arrays.sort(mergedarray);

        for (int k = 0; k < mergedarray.length; k++) {
            nums1[k] = mergedarray[k];
        }

        System.out.println("Merged and sorted array: " + Arrays.toString(nums1));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of nums1: ");
        int size1 = scanner.nextInt();

        System.out.print("Enter the number of valid elements in nums1 (m): ");
        int m = scanner.nextInt();

        int[] nums1 = new int[size1];
        System.out.println("Enter the elements of nums1:");
        for (int i = 0; i < m; i++) {
            nums1[i] = scanner.nextInt();
        }

        System.out.print("Enter the size of nums2 (n): ");
        int n = scanner.nextInt();

        int[] nums2 = new int[n];
        System.out.println("Enter the elements of nums2:");
        for (int i = 0; i < n; i++) {
            nums2[i] = scanner.nextInt();
        }

        for (int i = m; i < size1; i++) {
            nums1[i] = 0; // Fill the extra space with 0s
        }

        Mergesortedarray solution = new Mergesortedarray();
        solution.merge(nums1, m, nums2, n);

        scanner.close();
    }
}
