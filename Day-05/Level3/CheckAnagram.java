import java.util.Scanner;

public class CheckAnagram {

    // Method to check if two texts are anagrams
    public static boolean areAnagrams(String text1, String text2) {
        // Check if the lengths of both strings are equal
        if (text1.length() != text2.length()) {
            return false;
        }

        // Create arrays to store the frequency of characters in both strings
        int[] frequency1 = new int[256]; // Frequency array for the first string
        int[] frequency2 = new int[256]; // Frequency array for the second string

        // Loop through both strings to calculate the frequency of each character
        for (int i = 0; i < text1.length(); i++) {
            frequency1[text1.charAt(i)]++;
            frequency2[text2.charAt(i)]++;
        }

        // Compare the frequency arrays for both strings
        for (int i = 0; i < 256; i++) {
            if (frequency1[i] != frequency2[i]) {
                return false;
            }
        }

        // If the frequency arrays match, the texts are anagrams
        return true;
    }

    // Main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user inputs for the two texts
        System.out.print("Enter the first text: ");
        String text1 = sc.nextLine();

        System.out.print("Enter the second text: ");
        String text2 = sc.nextLine();

        // Call the areAnagrams method to check if the texts are anagrams
        boolean result = areAnagrams(text1, text2);

        // Display the result
        if (result) {
            System.out.println("The texts are anagrams.");
        } else {
            System.out.println("The texts are not anagrams.");
        }

        sc.close();
    }
}
