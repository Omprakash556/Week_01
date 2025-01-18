 import java.util.Scanner;

public class ReplaceWordInSentence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the sentence
        System.out.print("Enter the sentence: ");
        String sentence = scanner.nextLine();

        // Ask the user for the word to replace
        System.out.print("Enter the word to replace: ");
        String wordToReplace = scanner.nextLine();

        // Ask the user for the new word
        System.out.print("Enter the new word: ");
        String newWord = scanner.nextLine();

        // Replace the word in the sentence
        String modifiedSentence = replaceWord(sentence, wordToReplace, newWord);

        // Output the modified sentence
        System.out.println("Modified Sentence: " + modifiedSentence);

        scanner.close();
    }

    // Method to replace a given word with another word in a sentence
    public static String replaceWord(String sentence, String wordToReplace, String newWord) {
        // Split the sentence into words using space as a delimiter
        String[] words = sentence.split(" ");

        // Use a StringBuilder to build the modified sentence
        StringBuilder result = new StringBuilder();

        // Loop through each word in the sentence
        for (String word : words) {
            // If the word matches the word to replace, append the new word, otherwise append the word itself
            if (word.equals(wordToReplace)) {
                result.append(newWord);
            } else {
                result.append(word);
            }
            result.append(" ");  // Add space between words
        }

        // Return the modified sentence without the trailing space
        return result.toString().trim();
    }
}
