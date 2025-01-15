import java.util.Scanner;

public class OperationSplitText {

    // Method to split the text into words using charAt() without using split() method
    public static String[] splitTextIntoWords(String text) {
        StringBuilder currentWord = new StringBuilder();
        StringBuilder wordList = new StringBuilder();
        
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            // Check if the current character is a space or punctuation
            if (Character.isWhitespace(currentChar) || !Character.isLetterOrDigit(currentChar)) {
                if (currentWord.length() > 0) {
                    wordList.append(currentWord.toString() + " ");
                    currentWord.setLength(0);
                }
            } else {
                currentWord.append(currentChar);
            }
        }
        
        // Add the last word if any
        if (currentWord.length() > 0) {
            wordList.append(currentWord.toString());
        }
        
        return wordList.toString().trim().split(" ");
    }

    // Method to find the length of a word without using the length() method
    public static String getWordLength(String word) {
        int length = 0;
        for (int i = 0; i < word.length(); i++) {
            length++;
        }
        return String.valueOf(length);
    }

    // Method to generate 2D String array of words and their corresponding lengths
    public static String[][] getWordsAndLengths(String[] words) {
        String[][] result = new String[words.length][2];
        
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = getWordLength(words[i]);
        }
        
        return result;
    }

    // Method to find the shortest and longest string based on length
    public static int[] findShortestAndLongest(String[][] wordsAndLengths) {
        int[] result = new int[2];  // [0] = index of shortest word, [1] = index of longest word
        
        // Initialize with first word as both shortest and longest
        int minLength = Integer.parseInt(wordsAndLengths[0][1]);
        int maxLength = minLength;
        result[0] = 0;
        result[1] = 0;
        
        for (int i = 1; i < wordsAndLengths.length; i++) {
            int wordLength = Integer.parseInt(wordsAndLengths[i][1]);
            
            // Update shortest
            if (wordLength < minLength) {
                minLength = wordLength;
                result[0] = i;
            }
            
            // Update longest
            if (wordLength > maxLength) {
                maxLength = wordLength;
                result[1] = i;
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Take user input
        System.out.println("Enter a sentence:");
        String inputText = input.nextLine();
        
        // Split the text into words
        String[] words = splitTextIntoWords(inputText);
        
        // Get words and their lengths
        String[][] wordsAndLengths = getWordsAndLengths(words);
        
        // Find shortest and longest words
        int[] result = findShortestAndLongest(wordsAndLengths);
        
        // Display the result
        System.out.println("Shortest word: " + words[result[0]] + " with length " + wordsAndLengths[result[0]][1]);
        System.out.println("Longest word: " + words[result[1]] + " with length " + wordsAndLengths[result[1]][1]);
        
        // Close scanner
        input.close();
    }
}
