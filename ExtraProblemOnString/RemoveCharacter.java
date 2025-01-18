import java.util.Scanner;

public class RemoveCharacter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for input string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Ask the user for the character to remove
        System.out.print("Enter the character to remove: ");
        char charToRemove = scanner.next().charAt(0);

        // Remove the character from the string
        String modifiedString = removeCharacter(inputString, charToRemove);

        // Output the modified string
        System.out.println("Modified String: " + modifiedString);

        scanner.close();
    }

    // Method to remove all occurrences of a specific character from the string
    public static String removeCharacter(String str, char charToRemove) {
        StringBuilder result = new StringBuilder();

        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            // Append the character to result if it's not the one to be removed
            if (currentChar != charToRemove) {
                result.append(currentChar);
            }
        }

        return result.toString();
    }
}

