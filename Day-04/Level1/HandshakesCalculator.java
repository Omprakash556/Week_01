import java.util.Scanner;

public class HandshakesCalculator {

    // Method to calculate the number of handshakes 
    public static int calculateHandshakes(int n) {
        // Using the  formula
        return (n*(n - 1))/2;
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Take user input for the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        // Display The Output
        if (numberOfStudents < 2) {
            System.out.println("At least two students are required for a handshake.");
        } else {
            int handshakes = calculateHandshakes(numberOfStudents);

            // Output the result
            System.out.println("The maximum number of handshakes among " + numberOfStudents + " students is: " + handshakes);
        }

        // Close the scanner
        input.close();
    }
}
