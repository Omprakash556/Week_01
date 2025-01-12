import java.util.Scanner;

public class BMITracker {

    // Method to calculate BMI
    public static double calculateBMI(double weight, double heightInCm) {
        double heightInMeters = heightInCm / 100; // Convert height to meters
        return weight / (heightInMeters * heightInMeters); // BMI formula
    }

    // Method to determine BMI status
    public static String determineStatus(double bmi) {
        if (bmi <= 18.4) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            return "Normal";
        } else if (bmi >= 25.0 && bmi <= 39.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] data = new double[10][3]; // 2D array for weight, height, and BMI
        String[] statuses = new String[10]; // Array for BMI status

        // Input weight and height
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter weight (in kg) for person " + (i + 1) + ": ");
            data[i][0] = input.nextDouble(); // Weight

            System.out.println("Enter height (in cm) for person " + (i + 1) + ": ");
            data[i][1] = input.nextDouble(); // Height
        }

        // Calculate BMI and determine status
        for (int i = 0; i < 10; i++) {
            data[i][2] = calculateBMI(data[i][0], data[i][1]); // Calculate BMI
            statuses[i] = determineStatus(data[i][2]); // Determine BMI status
        }

        // Display results
        System.out.println("\nResults:");
        System.out.println("Weight(kg) | Height(cm) | BMI       | Status");
        System.out.println("-------------------------------------------");
        for (int i = 0; i < 10; i++) {
            System.out.println(data[i][0] + "         | " + data[i][1] + "       | " + 
                               String.format("%.2f", data[i][2]) + "     | " + statuses[i]);
        }

        input.close();
    }
}

