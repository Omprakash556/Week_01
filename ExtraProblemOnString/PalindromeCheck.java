import java.util.Scanner;

public class PalindromeCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for input
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Remove spaces and convert to lowercase for comparison
        inputString = inputString.replaceAll("\\s+", "").toLowerCase();

        // Initialize a flag to check palindrome
        boolean isPalindrome = true;

        // Loop to compare characters from the start and end of the string
        int length = inputString.length();
        for (int i = 0; i < length / 2; i++) {
            if (inputString.charAt(i) != inputString.charAt(length - i - 1)) {
                isPalindrome = false;
                break;
            }
        }

        // Output result
        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        scanner.close();
    }
}

