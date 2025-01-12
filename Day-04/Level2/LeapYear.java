import java.util.Scanner;

public class LeapYear {

    // Method to check if a year is a leap year
    public static void checkLeapYear(int year) {
        // Condition for leap year
        if ((year >= 1582) && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        // Check if the year is valid (>= 1582 for Gregorian calendar)
        if (year < 1582) {
            System.out.println("Please enter a year greater than or equal to 1582.");
        } else {
            // Call the method to check for leap year
            checkLeapYear(year);
        }

        // Close the scanner object to prevent resource leak
        input.close();
    }
}
