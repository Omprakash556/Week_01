import java.util.Scanner;

public class BMICalculatorUsingArray {
    public static void main(String[] args) {
		// Create a Scanner Object
        Scanner input = new Scanner(System.in);

        // Take input for the number of persons
        System.out.print("Enter the number of persons: ");
        int numberOfPerson = input.nextInt();

        // Create arrays to store the weight, height, BMI, and weight status
        double[] weight = new double[numberOfPerson];
        double[] height = new double[numberOfPerson];
        double[] bmi = new double[numberOfPerson];
        String[] status = new String[numberOfPerson];

        // Take input for weight and height of each person
        for (int i = 0; i < numberOfPerson; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");
            System.out.print("Weight (in kg): ");
            weight[i] = input.nextDouble();
            System.out.print("Height (in meters): ");
            height[i] = input.nextDouble();
        }

        // Calculate BMI and determine the weight status
        for (int i = 0; i < numberOfPerson; i++) {
            bmi[i] = weight[i] / (height[i] * height[i]);
            if (bmi[i] <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi[i] >= 18.5 && bmi[i] <= 24.9) {
                status[i] = "Normal";
            } else if (bmi[i] >= 25.0 && bmi[i] <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        // Display the height, weight, BMI, and weight status of each person
		System.out.println("\nDetails of all persons:");
		System.out.println("Height       Weight       BMI        Status");

        for (int i = 0; i < numberOfPerson; i++) {
		System.out.println(height[i] + "        " + weight[i] + "        " + bmi[i] + "        " + status[i]);
}
		
		// Close the Scanner
        input.close();
    }
}