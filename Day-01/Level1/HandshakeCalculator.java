import java.util.Scanner;

public class HandshakeCalculator {
    public static void main(String[] args) {
        // Create Scanner object for input
        Scanner input = new Scanner(System.in);

        // Input for the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        // Calculate the maximum number of handshakes using the combination formula
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Display the result
        System.out.println("The maximum number of handshakes among " + numberOfStudents + " students is: " + handshakes);

        // Close the scanner
        input.close();
    }
}
