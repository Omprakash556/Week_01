import java.util.Scanner;

public class FrequencyOfEachCharacter {

    // Method to find the frequency of characters in a string
    public static int[][] findCharacterFrequency(String text) {
        int[] frequency = new int[256]; // Array to store the frequency of each ASCII character

        // Count the frequency of each character in the string
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++;
        }

        // Calculate the number of unique characters
        int uniqueCount = 0;
        for (int freq : frequency) {
            if (freq > 0) {
                uniqueCount++;
            }
        }

        // Create a 2D array to store the characters and their frequencies
        int[][] charFrequency = new int[uniqueCount][2];
        int index = 0;
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                charFrequency[index][0] = i; // ASCII value of the character
                charFrequency[index][1] = frequency[i]; // Frequency of the character
                index++;
            }
        }

        return charFrequency;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string:");
        String inputText = input.nextLine();

        // Get the frequency of characters
        int[][] frequencies = findCharacterFrequency(inputText);

        // Display the result
        System.out.println("Character    Frequency");
        for (int[] charFreq : frequencies) {
            System.out.println((char) charFreq[0] + "            " + charFreq[1]);
        }

        input.close();
    }
}
