import java.util.Scanner;

public class CompareStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the first string
        System.out.print("Enter the first string: ");
        String string1 = scanner.nextLine();

        // Ask the user for the second string
        System.out.print("Enter the second string: ");
        String string2 = scanner.nextLine();

        // Compare the strings lexicographically
        int result = compareStrings(string1, string2);

        // Output the result of comparison
        if (result < 0) {
            System.out.println("The first string is lexicographically smaller than the second string.");
        } else if (result > 0) {
            System.out.println("The first string is lexicographically greater than the second string.");
        } else {
            System.out.println("The two strings are equal.");
        }

        scanner.close();
    }

    // Method to compare two strings lexicographically
    public static int compareStrings(String str1, String str2) {
        int length1 = str1.length();
        int length2 = str2.length();

        // Compare the strings character by character
        int minLength = Math.min(length1, length2);
        for (int i = 0; i < minLength; i++) {
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);

            if (ch1 < ch2) {
                return -1;  // str1 is lexicographically smaller
            } else if (ch1 > ch2) {
                return 1;   // str1 is lexicographically greater
            }
        }

        // If one string is a prefix of the other, the shorter string is smaller
        if (length1 < length2) {
            return -1;
        } else if (length1 > length2) {
            return 1;
        }

        return 0;  // The strings are equal
    }
}
