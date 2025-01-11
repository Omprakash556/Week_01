import java.util.Scanner;

public class AthleteRun {

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Input the sides of the triangle (in meters)
        System.out.print("Enter the length of side 1 in meters : ");
        int side1 = input.nextInt();

        System.out.print("Enter the length of side 2 in meters: ");
        int side2 = input.nextInt();

        System.out.print("Enter the length of side 3 in meters: ");
        int side3 = input.nextInt();

        // Calculate the perimeter of the triangle
        int perimeter = side1 + side2 + side3;

        // The total distance to be cover
        int totalDistance = 5000;

        // Calculate the number of rounds required
        int rounds = totalDistance / perimeter;

        // Output the result
        System.out.println("The total number of rounds the athlete will run is " + rounds + " to complete 5 km.");

        // Close the scanner
        input.close();
    }
}
