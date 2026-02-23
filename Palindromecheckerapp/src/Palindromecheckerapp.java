import java.util.Scanner;
import java.util.Stack;

public class PalindromeStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // 1. Create a Stack of Characters
        Stack<Character> stack = new Stack<>();

        // 2. Push Operation: Insert each character into the stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        // 3. Pop and Compare: Reversal Logic
        StringBuilder reversedBuilder = new StringBuilder();
        while (!stack.isEmpty()) {
            // Pop removes from the top (the end of the original string)
            reversedBuilder.append(stack.pop());
        }

        String reversed = reversedBuilder.toString();
        System.out.println("Reversed via Stack: " + reversed);

        // 4. Print Result (Compare original vs reversed)
        if (input.equalsIgnoreCase(reversed)) {
            System.out.println("✅ Result: It is a palindrome!");
        } else {
            System.out.println("❌ Result: It is NOT a palindrome.");
        }

        scanner.close();
    }
}