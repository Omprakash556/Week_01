import java.util.Scanner;

public class LongestWordInSentence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for input
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Find the longest word in the sentence
        String longestWord = findLongestWord(sentence);

        // Output the longest word
        System.out.println("The longest word is: " + longestWord);

        scanner.close();
    }

    // Method to find the longest word in the sentence
    public static String findLongestWord(String sentence) {
        // Split the sentence into words based on spaces
        String[] words = sentence.split("\\s+");

        // Initialize variables to keep track of the longest word
        String longestWord = "";

        // Loop through the words to find the longest one
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        return longestWord;
    }
}

