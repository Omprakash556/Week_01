import java.util.Scanner;

public class CalculateBMIOfBody {
	// Method to calculate BMI and Status
    public static String[][] calculateBMI(double[][] heightWeight) {
        String[][] results = new String[heightWeight.length][2]; // 2D array for BMI and status

        for (int i = 0; i < heightWeight.length; i++) {
            double weight = heightWeight[i][0];
            double heightInMeters = heightWeight[i][1] / 100; // Convert height to meters
            double bmi = weight / (heightInMeters * heightInMeters); // BMI formula
            bmi = Math.round(bmi * 100.0) / 100.0; // Round to 2 decimal places

            // Determine BMI status
            String status;
            if (bmi <= 18.4) {
                status = "Underweight";
            } else if (bmi <= 24.9) {
                status = "Normal";
            } else if (bmi <= 39.9) {
                status = "Overweight";
            } else {
                status = "Obese";
            }

            results[i][0] = String.valueOf(bmi); // Store BMI as a string
            results[i][1] = status;             // Store BMI status
        }

        return results;
    }

    // Method to display the results
    public static void displayResults(double[][] heightWeight, String[][] results) {
    System.out.println("Displaying BMI Results:");
    System.out.println("----------------------------");

    for (int i = 0; i < heightWeight.length; i++) {
        System.out.println("Person " + (i + 1) + ":");
        System.out.println("Weight: " + heightWeight[i][0] + " kg");
        System.out.println("Height: " + heightWeight[i][1] + " cm");
        System.out.println("BMI: " + results[i][0]);
        System.out.println("Status: " + results[i][1]);
        System.out.println("----------------------------");
    }
}

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numPeople = 10; // Number of persons
        double[][] heightWeight = new double[numPeople][2]; // 2D array for height and weight

        // Step 1: Take input for height and weight
        for (int i = 0; i < numPeople; i++) {
            System.out.println("Enter weight (in kg) for person " + (i + 1) + ":");
            heightWeight[i][0] = input.nextDouble();
            System.out.println("Enter height (in cm) for person " + (i + 1) + ":");
            heightWeight[i][1] = input.nextDouble();
        }

        // Step 2: Calculate BMI and Status
        String[][] results = calculateBMI(heightWeight);

        // Step 3: Display the results
        displayResults(heightWeight, results);
		
		// close the scanner
		input.close();
    }
}
