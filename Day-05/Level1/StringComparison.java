import java.util.Scanner;

public class StringComparison {

    // Method to compare two strings using charAt() method
    public static boolean compareStringsUsingCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;  // If lengths are not equal, they are not the same
        }

        // Compare each character in both strings
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;  // If any character differs, return false
            }
        }

        return true;  // If all characters match, return true
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input from user
        System.out.println("Enter the first string:");
        String str1 = input.next();
        
        System.out.println("Enter the second string:");
        String str2 = input.next();
		
        boolean resultUsingCharAt = compareStringsUsingCharAt(str1, str2);

      
        boolean resultUsingEqualsMethod = str1.equals(str2);

        // Display result
        System.out.println("Comparison using charAt(): " + resultUsingCharAt);
        System.out.println("Comparison using equals(): " + resultUsingEqualsMethod);

        if (resultUsingCharAt == resultUsingEqualsMethod) {
            System.out.println("Both methods gave the same result.");
        } else {
            System.out.println("The methods gave different results.");
        }

        input.close();
    }
}
