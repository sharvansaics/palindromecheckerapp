import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class PalindromeComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine().toLowerCase();

        // 1. Initialize Data Structures
        Stack<Character> stack = new Stack<>();       // LIFO
        Queue<Character> queue = new LinkedList<>();  // FIFO

        // 2. Enqueue and Push characters
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            stack.push(c);   // Goes to the top
            queue.add(c);    // Goes to the back
        }

        boolean isPalindrome = true;

        // 3. Compare dequeue vs pop
        while (!stack.isEmpty()) {
            char fromStack = stack.pop();    // Last character
            char fromQueue = queue.remove(); // First character

            if (fromStack != fromQueue) {
                isPalindrome = false;
                break;
            }
        }

        // 4. Print Result
        if (isPalindrome) {
            System.out.println("✅ Result: It is a palindrome!");
        } else {
            System.out.println("❌ Result: It is NOT a palindrome.");
        }

        scanner.close();
    }
}