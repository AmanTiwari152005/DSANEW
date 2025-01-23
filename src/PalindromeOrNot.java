class PalindromeOrNot {
    public boolean isPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }

        s = s.toLowerCase(); // Convert the string to lowercase for case-insensitive comparison
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            // Skip non-alphanumeric characters for the left pointer
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            // Skip non-alphanumeric characters for the right pointer
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            // Compare characters at the left and right pointers
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        PalindromeOrNot solution = new PalindromeOrNot();

        // Test cases
        String test1 = "A man, a plan, a canal: Panama";
        String test2 = "race a car";
        String test3 = " ";

        // Function calls
        System.out.println("Is \"" + test1 + "\" a palindrome? " + solution.isPalindrome(test1)); // Output: true
        System.out.println("Is \"" + test2 + "\" a palindrome? " + solution.isPalindrome(test2)); // Output: false
        System.out.println("Is \"" + test3 + "\" a palindrome? " + solution.isPalindrome(test3)); // Output: true
    }
}
