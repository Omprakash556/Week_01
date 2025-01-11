import java.util.Scanner;

public class SquareSide {
    public static void main(String[] args) {
        // Create Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Input for the perimeter of the square
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = scanner.nextDouble();

        // Calculate the length of the side of the square
        double side = perimeter / 4;

        // Display the result
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter + ".");

        // Close the scanner
        scanner.close();
    }
}
