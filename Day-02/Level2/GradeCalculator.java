import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Input marks for Physics, Chemistry, and Maths
        System.out.print("Enter marks for Physics: ");
        double physics = scanner.nextDouble();

        System.out.print("Enter marks for Chemistry: ");
        double chemistry = scanner.nextDouble();

        System.out.print("Enter marks for Maths: ");
        double maths = scanner.nextDouble();

        // Calculate total marks and percentage
        double totalMarks = physics + chemistry + maths;
        double percentage = (totalMarks / 300) * 100; 

        // Display the percentage
        System.out.println("Total Percentage: " + percentage + "%");

        // Determine the grade based on the percentage
        char grade;
        if (percentage >= 80) {
            grade = 'A';
        } else if (percentage >= 70) {
            grade = 'B';
        } else if (percentage >= 60) {
            grade = 'C';
        } else if (percentage >= 50) {
            grade = 'D';
        } else if (percentage >= 40) {
            grade = 'E';
        } else {
            grade = 'F';
        }

   
		// Display the grade and remarks
        System.out.println("Your Grade: " + grade);
        System.out.println("Remarks: " + remarks);

        // Close the scanner
        scanner.close();
    }
}
