import java.util.Scanner;

public class CheckPalindrome {

    // Logic 1: Compare characters from the start and end of the string
    public static boolean isPalindromeUsingLoop(String str) {
        int start = 0;
        int end = str.length() - 1;

        // Loop through the text and compare characters from start and end
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Logic 2: Recursive method to compare characters from start and end
    public static boolean isPalindromeUsingRecursion(String str, int start, int end) {
        // Base case: if the start index is greater than or equal to end, it's a palindrome
        if (start >= end) {
            return true;
        }

        // If characters at start and end are not equal, it's not a palindrome
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive case: call the method with start index incremented and end index decremented
        return isPalindromeUsingRecursion(str, start + 1, end - 1);
    }

    // Logic 3: Compare characters using character arrays
    public static boolean isPalindromeUsingArray(String str) {
        // Convert the string into a character array
        char[] originalArray = str.toCharArray();

        // Reverse the array
        char[] reversedArray = new char[originalArray.length];
        for (int i = 0; i < originalArray.length; i++) {
            reversedArray[i] = originalArray[originalArray.length - 1 - i];
        }

        // Compare the original and reversed arrays
        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] != reversedArray[i]) {
                return false;
            }
        }
        return true;
    }

    // Main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a text to check for palindrome: ");
        String inputString = sc.nextLine();

        // Logic 1: Palindrome check using loop
        boolean isPalindromeLoop = isPalindromeUsingLoop(inputString);
        System.out.println("Palindrome check using loop: " + (isPalindromeLoop ? "Yes" : "No"));

        // Logic 2: Palindrome check using recursion
        boolean isPalindromeRecursion = isPalindromeUsingRecursion(inputString, 0, inputString.length() - 1);
        System.out.println("Palindrome check using recursion: " + (isPalindromeRecursion ? "Yes" : "No"));

        // Logic 3: Palindrome check using character arrays
        boolean isPalindromeArray = isPalindromeUsingArray(inputString);
        System.out.println("Palindrome check using character array: " + (isPalindromeArray ? "Yes" : "No"));

        sc.close();
    }
}
