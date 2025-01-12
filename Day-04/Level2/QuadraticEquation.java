import java.util.Scanner;

public class QuadraticEquation {

    // Method to find the roots
    public static void findRoots(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c;
        
        if (delta > 0) {
            // Two real roots when delta > 0
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("The roots of the equation are: " + root1 + " and " + root2);
        } else if (delta == 0) {
            double root = -b / (2 * a);
            System.out.println("The root of the equation is: " + root);
        } else {
            System.out.println("There are no real roots.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for a, b, and c
        System.out.print("Enter the value of a: ");
        double a = scanner.nextDouble();
        
        System.out.print("Enter the value of b: ");
        double b = scanner.nextDouble();
        
        System.out.print("Enter the value of c: ");
        double c = scanner.nextDouble();

        // Call the method to find the roots
        findRoots(a, b, c);

        // Close the scanner
        scanner.close();
    }
}
