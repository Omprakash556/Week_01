import java.util.Scanner;

public class CheckCharacter {

    // Method to check if the character is a vowel, consonant, or not a letter
    public static String checkCharacterType(char ch) {
        // Convert to lowercase for uniformity
        ch = Character.toLowerCase(ch);

        // Check if it's a letter
        if (Character.isLetter(ch)) {
            // Check if it's a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        } else {
            return "Not a Letter";
        }
    }

    // Method to find vowels and consonants in a string using charAt() and return a 2D array
    public static String[][] findCharacterTypes(String text) {
        // Create a 2D array to store the character and its type
        String[][] result = new String[text.length()][2];

        // Iterate through each character in the string
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            String characterType = checkCharacterType(currentChar);
            
            // Store the character and its type in the 2D array
            result[i][0] = String.valueOf(currentChar);
            result[i][1] = characterType;
        }

        return result;
    }

    // Method to display the 2D array in a tabular format
    public static void displayCharacterTypes(String[][] characterTypes) {
        // Display the table headers
        System.out.println("Character\tType");
        
        // Display each character and its type
        for (int i = 0; i < characterTypes.length; i++) {
            System.out.println(characterTypes[i][0] + "\t\t" + characterTypes[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.println("Enter a string:");
        String inputText = input.nextLine();

        // Get the character types for each character in the string
        String[][] characterTypes = findCharacterTypes(inputText);

        // Display the results in a tabular format
        displayCharacterTypes(characterTypes);

        // Close the scanner
        input.close();
    }
}
