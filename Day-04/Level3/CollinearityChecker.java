import java.util.Scanner;

public class CollinearityChecker {

    // Method to check if the points are collinear using slope formula
    public static boolean arePointsCollinearBySlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        // Calculate slope AB and slope BC
        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        
        // If slopes AB and BC are equal, the points are collinear
        return slopeAB == slopeBC;
    }

    // Method to check if the points are collinear using the area of triangle formula
    public static boolean arePointsCollinearByArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        // Calculate area using the formula
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        
        // Points are collinear if the area is zero
        return area == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the three points
        System.out.print("Enter x1, y1 for Point A: ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.print("Enter x2, y2 for Point B: ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        System.out.print("Enter x3, y3 for Point C: ");
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();

        // Check collinearity using slope method
        boolean collinearBySlope = arePointsCollinearBySlope(x1, y1, x2, y2, x3, y3);
        
        // Check collinearity using area method
        boolean collinearByArea = arePointsCollinearByArea(x1, y1, x2, y2, x3, y3);

        // Output the results
        if (collinearBySlope && collinearByArea) {
            System.out.println("The points A(" + x1 + "," + y1 + "), B(" + x2 + "," + y2 + "), and C(" + x3 + "," + y3 + ") are collinear.");
        } else {
            System.out.println("The points A(" + x1 + "," + y1 + "), B(" + x2 + "," + y2 + "), and C(" + x3 + "," + y3 + ") are NOT collinear.");
        }
    }
}
