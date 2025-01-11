import java.util.Scanner;

public class LeapYear2 {

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Take the year as input from the user
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Single if statement using logical operators to check leap year
        if (year >= 1582 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
            System.out.println(year + " is a Leap Year.");
        } else if (year >= 1582) {
            System.out.println(year + " is not a Leap Year.");
        } else {
            System.out.println("Year must be 1582 or later.");
        }

        // Close the scanner
        scanner.close();
    }
}
