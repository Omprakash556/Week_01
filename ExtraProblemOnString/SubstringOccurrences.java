import java.util.Scanner;

public class SubstringOccurrences {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for input
        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine();

        // Ask the user for the substring
        System.out.print("Enter the substring: ");
        String substring = scanner.nextLine();

        // Count the occurrences of the substring
        int count = countSubstringOccurrences(mainString, substring);

        // Output the count of occurrences
        System.out.println("The substring '" + substring + "' occurs " + count + " times in the main string.");

        scanner.close();
    }

    // Method to count the occurrences of a substring in the main string
    public static int countSubstringOccurrences(String mainString, String substring) {
        int count = 0;
        int index = 0;

        // Loop to find all occurrences of the substring
        while ((index = mainString.indexOf(substring, index)) != -1) {
            count++;
            index += substring.length();  // Move index forward by the length of the substring
        }

        return count;
    }
}

