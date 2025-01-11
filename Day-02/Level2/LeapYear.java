import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        // Create a Scanner object 
        Scanner scanner = new Scanner(System.in);

        // Take the year as input from the user
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Ensure the year is greater than or equal to 1582
        if (year >= 1582) {
            // Check if the year is divisible by 400 (Leap Year)
            if (year % 400 == 0) {
                System.out.println(year + " is a Leap Year.");
            }
            // Check if the year is divisible by 100 but not 400 (Not a Leap Year)
            else if (year % 100 == 0) {
                System.out.println(year + " is not a Leap Year.");
            }
            // Check if the year is divisible by 4 (Leap Year)
            else if (year % 4 == 0) {
                System.out.println(year + " is a Leap Year.");
            }
            // If none of the above, it's not a Leap Year
            else {
                System.out.println(year + " is not a Leap Year.");
            }
        } else {
            System.out.println("Year must be 1582 or later as per the Gregorian calendar.");
        }

        // Close the scanner
        scanner.close();
    }
}
