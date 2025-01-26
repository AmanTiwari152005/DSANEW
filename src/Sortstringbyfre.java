//leetcode question number 451(medium)
class Sortstringbyfre {
    public static void main(String[] args) {
        // Create an instance of the Solution class
        Sortstringbyfre solution = new Sortstringbyfre();

        // Example input string
        String input = "tree";

        // Call the frequencySort function
        String result = solution.frequencySort(input);

        // Print the result
        System.out.println("Sorted string by frequency: " + result);
    }

    public String frequencySort(String s) {
        char[] arr = s.toCharArray();

        // Sort the characters based on frequency and lexicographical order
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int freq1 = countFrequency(arr, arr[i]);
                int freq2 = countFrequency(arr, arr[j]);

                // Sort by frequency (descending) and lexicographical order (ascending) if frequencies are equal
                if (freq1 < freq2 || (freq1 == freq2 && arr[i] > arr[j])) {
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // Convert the sorted array back to a string
        return new String(arr);
    }

    // Helper method to count the frequency of a character in the array
    private int countFrequency(char[] arr, char target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
            }
        }
        return count;
    }
}
