import java.util.Scanner;

public class SplitWords {
    
    // Method to split the text into words using charAt()
    public static String[] splitTextIntoWords(String text) {
        // Create a StringBuilder to store words
        StringBuilder currentWord = new StringBuilder();
        // Use an array list to store the words temporarily
        StringBuilder wordList = new StringBuilder();
        
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            // Check if the current character is a space or punctuation
            if (Character.isWhitespace(currentChar) || !Character.isLetterOrDigit(currentChar)) {
                if (currentWord.length() > 0) {
                    wordList.append(currentWord.toString() + " "); // Add the word to the list
                    currentWord.setLength(0); // Reset current word
                }
            } else {
                currentWord.append(currentChar); // Build the current word
            }
        }
        
        // Add the last word if any
        if (currentWord.length() > 0) {
            wordList.append(currentWord.toString());
        }
        
        // Split the words by spaces
        return wordList.toString().trim().split(" ");
    }

    // Method to find and return the length of a word without using the length() method
    public static String getWordLength(String word) {
        int length = 0;
        for (int i = 0; i < word.length(); i++) {
            length++;
        }
        return String.valueOf(length);
    }

    // Method to generate 2D String array of words and their lengths
    public static String[][] getWordsAndLengths(String[] words) {
        // Create a 2D String array to store words and their corresponding lengths
        String[][] result = new String[words.length][2];
        
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i]; // word
            result[i][1] = getWordLength(words[i]); // length
        }
        
        return result;
    }

    public static void main(String[] args) {
        // Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Take user input
        System.out.println("Enter a sentence:");
        String text = input.nextLine();
        
        // Split the text into words
        String[] words = splitTextIntoWords(text);
        
        // Get words and their lengths
        String[][] wordsAndLengths = getWordsAndLengths(words);
        
        // Display the result in a tabular format
        System.out.println("Word\tLength");
        for (int i = 0; i < wordsAndLengths.length; i++) {
            // Convert length to Integer for display
            System.out.println(wordsAndLengths[i][0] + "\t" + Integer.valueOf(wordsAndLengths[i][1]));
        }
        
        // Close scanner
        input.close();
    }
}
