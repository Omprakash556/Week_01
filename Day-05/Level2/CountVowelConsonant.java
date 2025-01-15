import java.util.Scanner;

public class CountVowelConsonant {

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

    // Method to find vowels and consonants in a string using charAt() and return counts
    public static int[] countVowelsAndConsonants(String text) {
        int vowelCount = 0;
        int consonantCount = 0;

        // Iterate through each character of the string using charAt()
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);

            // Check if the character is a vowel or consonant
            String result = checkCharacterType(currentChar);

            // Update counts based on the result
            if (result.equals("Vowel")) {
                vowelCount++;
            } else if (result.equals("Consonant")) {
                consonantCount++;
            }
        }

        // Return the counts in an array: [vowels, consonants]
        return new int[]{vowelCount, consonantCount};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.println("Enter a string:");
        String inputText = input.nextLine();

        // Get the counts of vowels and consonants
        int[] counts = countVowelsAndConsonants(inputText);

        // Display the results
        System.out.println("Number of vowels: " + counts[0]);
        System.out.println("Number of consonants: " + counts[1]);

        // Close the scanner
        input.close();
    }
}
