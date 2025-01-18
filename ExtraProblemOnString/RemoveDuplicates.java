import java.util.Scanner;

public class RemoveDuplicates {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for input
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Remove duplicates from the string
        String modifiedString = removeDuplicates(inputString);

        // Output the modified string
        System.out.println("String after removing duplicates: " + modifiedString);

        scanner.close();
    }

    // Method to remove duplicate characters from the string
    public static String removeDuplicates(String input) {
        // Create a result StringBuilder
        StringBuilder result = new StringBuilder();

        // Loop through each character in the input string
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            // Check if the character is already in the result
            if (result.indexOf(String.valueOf(currentChar)) == -1) {
                // If not, append it to the result
                result.append(currentChar);
            }
        }

        // Return the modified string with duplicates removed
        return result.toString();
    }
}

