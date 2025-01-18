import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the first string
        System.out.print("Enter the first string: ");
        String string1 = scanner.nextLine();

        // Ask the user for the second string
        System.out.print("Enter the second string: ");
        String string2 = scanner.nextLine();

        // Check if the strings are anagrams
        boolean result = areAnagrams(string1, string2);

        // Output the result
        if (result) {
            System.out.println("The two strings are anagrams.");
        } else {
            System.out.println("The two strings are not anagrams.");
        }

        scanner.close();
    }

    // Method to check if two strings are anagrams
    public static boolean areAnagrams(String str1, String str2) {
        // If the lengths are different, they can't be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert both strings to lowercase and remove spaces for uniformity
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // Convert strings to character arrays and sort them
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        // Sort the arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Check if the sorted arrays are equal
        return Arrays.equals(arr1, arr2);
    }
}

