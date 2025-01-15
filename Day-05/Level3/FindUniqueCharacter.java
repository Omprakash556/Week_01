import java.util.Scanner;

public class FindUniqueCharacter {
	
    // Method to find the length of a string without using length()
    public static int findLength(String text) {
        int length = 0;
        try {
            while (true) {
                text.charAt(length); // Try to access characters in the string
                length++;
            }
        } catch (IndexOutOfBoundsException e) {
            // When an exception is thrown, we have reached the end of the string
        }
        return length;
    }

    // Method to find unique characters in the string
    public static char[] findUniqueCharacters(String text, int length) {
        char[] unique = new char[length]; // Array to store unique characters
        int index = 0;

        for (int i = 0; i < length; i++) {
            char current = text.charAt(i);
            boolean isUnique = true;

            // Check if the character has appeared before
            for (int j = 0; j < index; j++) {
                if (unique[j] == current) {
                    isUnique = false;
                    break;
                }
            }

            // If the character is unique, add it to the unique array
            if (isUnique) {
                unique[index] = current;
                index++;
            }
        }

        return unique; // Return the array of unique characters
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input for the string
        System.out.println("Enter a string:");
        String text = input.nextLine();

        // Find the length of the string without using the length() method
        int length = findLength(text);

        // Find unique characters in the string
        char[] uniqueChars = findUniqueCharacters(text, length);

        // Display the results
        System.out.println("Unique characters in the string are:");
        for (char c : uniqueChars) {
            if (c != '\0') {
                System.out.print(c + " ");
            }
        }

        // Close the scanner
        input.close();
    }
}
