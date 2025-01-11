import java.util.Scanner;

public class HeightConverter {
    public static void main(String[] args) {
        // Create a scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Ask for the user's height in cm
        System.out.print("Enter your height in centimeters: ");
        double heightInCm = scanner.nextDouble();

        // Conversion constants
        double cmPerInch = 2.54;
        int inchesPerFoot = 12;

        // Convert cm to inches
        double totalInches = heightInCm / cmPerInch;

        // Convert inches to feet and the remaining inches
        int feet = (int) totalInches / inchesPerFoot;
        int inches = (int) totalInches % inchesPerFoot;

        // Output the results
        System.out.println("Your Height in cm is " + heightInCm + " while in feet is " + feet + " and inches is " + inches);

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
