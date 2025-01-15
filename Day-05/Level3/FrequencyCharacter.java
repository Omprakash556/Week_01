import java.util.Scanner;

public class FrequencyCharacter {

    // Method to find unique characters in a string
    public static char[] uniqueCharacters(String str) {
        // A boolean array to mark the characters that have appeared
        boolean[] seen = new boolean[256];
        int uniqueCount = 0;

        // Loop through the string to count the unique characters
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!seen[ch]) {
                seen[ch] = true;
                uniqueCount++;
            }
        }

        // Create a char array to store the unique characters
        char[] uniqueChars = new char[uniqueCount];
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (seen[ch]) {
                uniqueChars[index++] = ch;
                seen[ch] = false;
            }
        }
        return uniqueChars;
    }

    // Method to find the frequency of characters in a string
    public static String[][] characterFrequency(String str) {
        // Array to store the frequency of each character (based on ASCII values)
        int[] freq = new int[256];

        // Loop through the string to populate the frequency array
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch]++;
        }

        // Call uniqueCharacters to get the unique characters
        char[] uniqueChars = uniqueCharacters(str);

        // 2D array to store the characters and their frequencies
        String[][] result = new String[uniqueChars.length][2];

        // Loop through the unique characters and store their frequencies
        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]);
            result[i][1] = String.valueOf(freq[uniqueChars[i]]);
        }

        return result;
    }

    // Main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();

        // Call characterFrequency method
        String[][] frequencyTable = characterFrequency(inputString);

        // Display the result
        System.out.println("Character Frequency:");
        for (int i = 0; i < frequencyTable.length; i++) {
            System.out.println(frequencyTable[i][0] + ": " + frequencyTable[i][1]);
        }

        sc.close();
    }
}
