import java.util.Scanner;

public class DistanceConversion {
    public static void main(String[] args) {
        // Create Scanner object for input
        Scanner input = new Scanner(System.in);

        // Input for the distance in feet
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = input.nextDouble();

        // Convert the distance  feet to yards
        double distanceInYards = distanceInFeet / 3;

        // Convert the distance yards to miles
        double distanceInMiles = distanceInYards / 1760;

        // Display the results
        System.out.println("The distance in yards is " + distanceInYards + " yards.");
        System.out.println("The distance in miles is " + distanceInMiles + " miles.");

        // Close the scanner
        input.close();
    }
}
