import java.util.Scanner;

public class ConversionOfUpperCase {

    // Method to convert a string to uppercase
    public static String convertToUppercaseUsingCharAt(String text) {
        StringBuilder uppercaseText = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            
            // Check if the character is a lowercase letter
            if (currentChar >= 'a' && currentChar <= 'z') {
                // Convert to uppercase by adjusting ASCII value
                currentChar = (char) (currentChar - 32);  
            }
            uppercaseText.append(currentChar);
        }
        
        return uppercaseText.toString();
    }

    // Method to compare two strings 
    public static boolean compareStrings(String text1, String text2) {
        if (text1.length() != text2.length()) {
            return false; 
        }
        
        for (int i = 0; i < text1.length(); i++) {
            if (text1.charAt(i) != text2.charAt(i)) {
                return false; 
            }
        }
        
        return true; 
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input for the text
        System.out.print("Enter the text: ");
        String text = input.nextLine();

        // Convert to uppercase using the user-defined method
        String userBuild = convertToUppercaseUsingCharAt(text);

       // Convert to uppercase using in built  method
        String inBuilt = text.toUpperCase();

        // Compare both results 
        boolean areEqual = compareStrings(userBuild, inBuilt);

        // Display the results
        System.out.println("Converted using custom method: " + userBuild);
        System.out.println("Converted using built-in method: " + inBuilt);
        System.out.println("Are both results equal? " + areEqual);

        input.close();
    }
}

