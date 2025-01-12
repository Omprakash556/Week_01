import java.util.Scanner;

public class EuclideanDistanceAndLineEquation {

    public static double calculateEuclideanDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static double[] calculateLineEquation(double x1, double y1, double x2, double y2) {
        double[] lineEquation = new double[2];

        double m = (y2 - y1) / (x2 - x1);

        double b = y1 - m * x1;

        // Store the slope and intercept in the array
        lineEquation[0] = m;
        lineEquation[1] = b;

        return lineEquation;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take inputs for the two points
        System.out.print("Enter the coordinates of the first point (x1, y1): ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.print("Enter the coordinates of the second point (x2, y2): ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        // Calculate the Euclidean distance between the two points
        double distance = calculateEuclideanDistance(x1, y1, x2, y2);
        System.out.println("The Euclidean distance between the points is: " + distance);

        // Calculate the equation of the line
        double[] lineEquation = calculateLineEquation(x1, y1, x2, y2);
        double m = lineEquation[0];
        double b = lineEquation[1];

        // Display the equation of the line
        System.out.println("The equation of the line is: y = " + m + "x + " + b);
    }
}

