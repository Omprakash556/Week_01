import java.util.Scanner;

public class CheckString {

    // Method to compare two strings using charAt()
    public static boolean compareStringsCharAt(String str1, String str2) {
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

        // Taking user input
        System.out.print("Enter the first string: ");
        String string1 = input.next();

        System.out.print("Enter the second string: ");
        String string2 = input.next();

        boolean resultCharAt = compareStringsCharAt(string1, string2);

        boolean resultEquals = string1.equals(string2);

        // Display results
        System.out.println("Result using charAt() method: " + resultCharAt);
        System.out.println("Result using equals() method: " + resultEquals);

        // Check if the results
        if (resultCharAt == resultEquals) {
            System.out.println("Both methods produce the same result.");
        } else {
            System.out.println("The methods produce different results.");
        }

        input.close();
    }
}
