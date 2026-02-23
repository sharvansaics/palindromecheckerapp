public class Palindromecheckerapp {
    public static void main(String[] args) {
        String original = "radar";
        String reverse = "";

        // Using StringBuilder to reverse the string easily
        reverse = new StringBuilder(original).reverse().toString();

        if (original.equals(reverse)) {
            System.out.println(original + " is a palindrome. ");
        } else {
            System.out.println(original + " is not a palindrome. ");
        }
    }
}