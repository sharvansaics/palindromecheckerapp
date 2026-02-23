import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Palindromecheckerapp {
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
            stack.push(c);   // Adds to top
            queue.add(c);    // Adds to back
        }

        boolean isMatch = true;

        // 3. Compare dequeue vs pop
        // The Queue gives us the string from start-to-end (FIFO)
        // The Stack gives us the string from end-to-start (LIFO)
        while (!stack.isEmpty()) {
            if (stack.pop() != queue.remove()) {
                isMatch = false;
                break;
            }
        }

        // 4. Print Result
        if (isMatch) {
            System.out.println("✅ It's a palindrome! (FIFO and LIFO sequences matched)");
        } else {
            System.out.println("❌ Not a palindrome. (Sequences differed)");
        }

        scanner.close();
    }
}