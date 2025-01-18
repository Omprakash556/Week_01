import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for input
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Initialize an empty string to store the reversed string
        String reversedString = "";

        // Loop through the original string from end to start
        for (int i = inputString.length() - 1; i >= 0; i--) {
            // Append each character to the reversed string
            reversedString += inputString.charAt(i);
        }

        // Output the reversed string
        System.out.println("Reversed String: " + reversedString);

        scanner.close();
    }
}

