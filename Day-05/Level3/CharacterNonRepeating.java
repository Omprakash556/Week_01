import java.util.Scanner;

public class CharacterNonRepeating {

    // Method to find the first non-repeating character
    public static char findFirstNonRepeatingCharacter(String text) {
        int[] frequency = new int[256]; // Array to store frequency of each ASCII character

        // Count the frequency of each character in the string
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++;
        }

        // Find the first character with a frequency of 1
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (frequency[currentChar] == 1) {
                return currentChar; 
            }
        }
        return '\0'; 
    }
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        char result = findFirstNonRepeatingCharacter(input);

        if (result != '\0') {
            System.out.println("The first non-repeating character is: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }

        scanner.close();
    }
}
