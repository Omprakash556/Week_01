import java.util.Scanner;

public class MostFrequentCharacter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for input
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Find the most frequent character
        char mostFrequentChar = findMostFrequentCharacter(inputString);

        // Output the result
        System.out.println("Most Frequent Character: '" + mostFrequentChar + "'");

        scanner.close();
    }

    // Method to find the most frequent character in the string
    public static char findMostFrequentCharacter(String str) {
        int[] frequency = new int[256];  // Array to store the frequency of each character
        int maxFreq = 0;  // Variable to track the maximum frequency
        char mostFrequentChar = ' ';  // Variable to store the most frequent character

        // Loop through each character in the string and count the frequency
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            frequency[ch]++;  // Increment the frequency for this character

            // If the frequency of the current character is greater than the maxFreq, update
            if (frequency[ch] > maxFreq) {
                maxFreq = frequency[ch];
                mostFrequentChar = ch;
            }
        }

        return mostFrequentChar;
    }
}

