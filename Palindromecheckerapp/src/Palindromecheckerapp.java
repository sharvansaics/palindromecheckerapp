import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Palindromecheckerapp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Use Java's built-in Deque interface
        Deque<Character> deque = new ArrayDeque<>();

        // 1. Add all characters to the rear of the deque
        for (char ch : input.toCharArray()) {
            deque.addLast(ch);
        }

        boolean isPalindrome = true;

        // 2. Compare front and rear until 0 or 1 character remains
        while (deque.size() > 1) {
            char first = deque.removeFirst();
            char last = deque.removeLast();

            if (first != last) {
                isPalindrome = false;
                break;
            }
        }

        // 3. Output result
        if (isPalindrome) {
            System.out.println("The string is a Palindrome");
        } else {
            System.out.println("The string is NOT a Palindrome");
        }

        scanner.close();
    }
}