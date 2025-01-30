//leetcode question number 1704(easy)
class Stringhalvesalike {
    public boolean halvesAreAlike(String s) {
        int mid = s.length() / 2;

        String a = s.substring(0, mid);
        String b = s.substring(mid);

        int count1 = 0, count2 = 0;
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < a.length(); i++) {
            if (vowels.indexOf(a.charAt(i)) != -1) {
                count1++;
            }
        }

        for (int j = 0; j < b.length(); j++) {
            if (vowels.indexOf(b.charAt(j)) != -1) {
                count2++;
            }
        }

        return count1 == count2;
    }

    public static void main(String[] args) {
        Stringhalvesalike sol = new Stringhalvesalike();

        // Test cases
        String test1 = "book";        // true (equal vowels: "bo" and "ok")
        String test2 = "textbook";    // false (different vowels: "text" and "book")
        String test3 = "AbCdEfGh";    // true (equal vowels: "AbCd" and "EfGh")
        String test4 = "hellothere";  // false (different vowels)

        // Function calls and output
        System.out.println(sol.halvesAreAlike(test1)); // Expected: true
        System.out.println(sol.halvesAreAlike(test2)); // Expected: false
        System.out.println(sol.halvesAreAlike(test3)); // Expected: true
        System.out.println(sol.halvesAreAlike(test4)); // Expected: false
    }
}
