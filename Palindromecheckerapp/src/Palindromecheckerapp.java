 class Palindromecheckerapp {

    public static boolean checkPalindrome(String str) {
        // 1. Base Conditions
        // If length is 0 or 1, it's a palindrome
        if (str.length() <= 1) {
            return true;
        }

        // 2. Compare start and end characters
        if (str.charAt(0) == str.charAt(str.length() - 1)) {
            // 3. Recursive Call: Check the substring excluding the ends
            return checkPalindrome(str.substring(1, str.length() - 1));
        }

        // If characters don't match, it's not a palindrome
        return false;
    }

    public static void main(String[] args) {
        String word = "radar";
        boolean result = checkPalindrome(word.toLowerCase());
        System.out.println("Is '" + word + "' a palindrome? " + result);
    }
}