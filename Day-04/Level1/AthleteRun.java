import java.util.Scanner;

public class AthleteRun {

    // Method to compute the number of rounds needed to complete a 5 km run
    public static int calculateRounds(int perimeter) {
        // Total distance to run (5 km = 5000 meters)
        int totalDistance = 5000;
        // Calculate the number of rounds required
        return totalDistance / perimeter;
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Take user input for the three sides of the triangle
        System.out.print("Enter the length of side 1: ");
        int side1 = input.nextInt();

        System.out.print("Enter the length of side 2: ");
        int side2 = input.nextInt();

        System.out.print("Enter the length of side 3: ");
        int side3 = input.nextInt();

        // Calculate the perimeter of the triangle
        int perimeter = side1 + side2 + side3;

        // Call the method to calculate the number of rounds
        int rounds = calculateRounds(perimeter);

        // Output the result
        System.out.println("To complete a 5 km run, the athlete must complete " + rounds + " rounds.");

        // Close the scanner
        input.close();
    }
}
