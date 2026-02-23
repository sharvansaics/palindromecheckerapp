import java.util.Scanner;

public class Palindromecheckerapp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to check: ");
        String original = scanner.nextLine();

        // 1. Reverse string using a loop
        String reversed = "";

        // We start from the last index (length - 1) and move to 0
        for (int i = original.length() - 1; i >= 0; i--) {
            // String Concatenation (+) - creates a new string object each time
            reversed = reversed + original.charAt(i);
        }

        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);

        // 2. Compare original and reversed using .equals()
        // Note: We use .equals() because '==' compares memory addresses, not content
        if (original.equalsIgnoreCase(reversed)) {
            System.out.println("Result: It is a palindrome!");
        } else {
            System.out.println("Result: It is NOT a palindrome.");
        }

        scanner.close();
    }
}