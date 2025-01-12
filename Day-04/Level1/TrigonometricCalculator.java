import java.util.Scanner;

public class TrigonometricCalculator {

    // Method to calculate and print sine, cosine, and tangent
    public static void calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);

        // Calculate sine, cosine, and tangent
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        // Print the results
        System.out.println("For an angle of " + angle + " degrees:");
        System.out.println("Sine: " + sine);
        System.out.println("Cosine: " + cosine);
        System.out.println("Tangent: " + tangent);
    }

    public static void main(String[] args) {
        // Create a Scanner object 
        Scanner scanner = new Scanner(System.in);

        // User to enter an angle in degrees
        System.out.print("Enter the angle in degrees: ");
        double angle = scanner.nextDouble();

        // Call the method
        calculateTrigonometricFunctions(angle);

        // Close the scanner 
        scanner.close();
    }
}
