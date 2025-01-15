import java.util.Scanner;

public class CharacterFrequency {

    // Method to find the frequency of characters in a string
    public static String[] findFrequency(String str) {
        // Convert the string into a character array
        char[] chars = str.toCharArray();
        int length = chars.length;
        int[] frequency = new int[length]; // Array to store the frequency of characters
        String[] result = new String[length]; // Array to store the characters and their frequencies

        // Loop through each character in the string (outer loop)
        for (int i = 0; i < length; i++) {
            // Skip if the character is already counted (marked with frequency 0)
            if (chars[i] == '0') {
                continue;
            }

            // Count the frequency of the character (inner loop)
            int count = 1; // We have already encountered the character once
            for (int j = i + 1; j < length; j++) {
                if (chars[i] == chars[j]) {
                    count++;
                    chars[j] = '0'; // Mark this character as counted
                }
            }

            // Store the result in the format "character: frequency"
            result[i] = chars[i] + ": " + count;
            frequency[i] = count; // Store frequency for later reference (optional)
        }

        return result;
    }

    // Main function
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String inputString = input.nextLine();

        // Call findFrequency method
        String[] frequencyResult = findFrequency(inputString);

        // Display the result
        System.out.println("Character Frequency:");
        for (String res : frequencyResult) {
            // Display the result for characters with non-zero frequency
            if (res != null) {
                System.out.println(res);
            }
        }

        input.close();
    }
}
