import java.util.ArrayDeque;
import java.util.Deque;

public class Palindromecheckerapp {
    public static boolean isPalindrome(String input) {
        // Clean the string (remove spaces/case)
        String cleanInput = input.replaceAll("\\s+", "").toLowerCase();

        Deque<Character> deque = new ArrayDeque<>();

        // 1. Insert characters into deque
        for (char ch : cleanInput.toCharArray()) {
            deque.addLast(ch);
        }

        // 2. Remove first & last and compare until empty (or 1 remains)
        while (deque.size() > 1) {
            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
                return false; // Mismatch found
            }
        }

        return true; // All pairs matched
    }

    public static void main(String[] args) {
        String test = "Racecar";
        System.out.println("Is '" + test + "' a palindrome? " + isPalindrome(test));
    }
}