import java.util.Scanner;

public class Palindromecheckerapp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // 1. Convert string to char array
        char[] chars = input.toLowerCase().toCharArray();

        // 2. Use two-pointer approach
        boolean isPalindrome = true;
        int start = 0;               // Pointer 1: Beginning
        int end = chars.length - 1;  // Pointer 2: End

        while (start < end) {
            // 3. Compare start & end characters
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break; // Stop immediately if a mismatch is found
            }
            start++; // Move forward
            end--;   // Move backward
        }

        // Display result
        if (isPalindrome) {
            System.out.println("Result: It is a palindrome!");
        } else {
            System.out.println("Result: It is NOT a palindrome.");
        }

        scanner.close();
    }
}