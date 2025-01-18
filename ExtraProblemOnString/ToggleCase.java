 import java.util.Scanner;

public class ToggleCase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for input
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Toggle the case of each character
        String toggledString = toggleCase(inputString);

        // Output the string after toggling the case
        System.out.println("String after toggling case: " + toggledString);

        scanner.close();
    }

    // Method to toggle the case of each character in the string
    public static String toggleCase(String input) {
        StringBuilder result = new StringBuilder();

        // Loop through each character in the string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Check if the character is uppercase and convert to lowercase
            if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch));
            }
            // Check if the character is lowercase and convert to uppercase
            else if (Character.isLowerCase(ch)) {
                result.append(Character.toUpperCase(ch));
            } else {
                // If it's neither (e.g., a special character or number), append as is
                result.append(ch);
            }
        }

        return result.toString();
    }
}
