import java.util.Scanner;

public class CompareStringLeadingTrailing {

    // Method to trim the leading and trailing spaces using charAt()
    public static int[] findTrimBounds(String text) {
        int start = 0;
        int end = text.length() - 1;

        // Find the first non-space character from the beginning (leading spaces)
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }

        // Find the first non-space character from the end (trailing spaces)
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        // Return the start and end indices of the trimmed string
        return new int[]{start, end};
    }

    // Method to create a substring from the string using the charAt(), start, and end indices
    public static String getSubstring(String text, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i <= end; i++) {
            result.append(text.charAt(i));
        }
        return result.toString();
    }

    // Method to compare two strings using the charAt() method and return a boolean result
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input for the string
        System.out.println("Enter a string:");
        String inputText = input.nextLine();

        // Trim the leading and trailing spaces using charAt() method
        int[] bounds = findTrimBounds(inputText);
        String trimmedUsingCharAt = getSubstring(inputText, bounds[0], bounds[1]);

        // Trim the string using the built-in trim() method
        String trimmedUsingTrimMethod = inputText.trim();

        // Compare the two trimmed strings
        boolean isEqual = compareStrings(trimmedUsingCharAt, trimmedUsingTrimMethod);

        // Display the results
        System.out.println("Trimmed using charAt(): \"" + trimmedUsingCharAt + "\"");
        System.out.println("Trimmed using trim(): \"" + trimmedUsingTrimMethod + "\"");
        System.out.println("Are the two trimmed strings equal? " + isEqual);

        // Close the scanner
        input.close();
    }
}
