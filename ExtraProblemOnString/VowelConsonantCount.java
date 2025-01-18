import java.util.Scanner;

public class VowelConsonantCount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for input
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Initialize counts for vowels and consonants
        int vowelCount = 0;
        int consonantCount = 0;

        // Convert the string to lowercase for easier comparison
        inputString = inputString.toLowerCase();

        // Loop through each character in the string
        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);

            // Check if the character is a letter
            if (Character.isLetter(ch)) {
                // Check if the character is a vowel
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++;
                }
                // Otherwise, it's a consonant
                else {
                    consonantCount++;
                }
            }
        }

        // Output the counts
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);

        scanner.close();
    }
}
