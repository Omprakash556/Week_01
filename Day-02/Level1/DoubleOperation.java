import java.util.Scanner;

public class DoubleOperation {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Taking three Double inputs: a, b, and c
        System.out.print("Enter the value of a: ");
        double a = input.nextDouble();
        System.out.print("Enter the value of b: ");
        double b = input.nextDouble();
        System.out.print("Enter the value of c: ");
        double c = input.nextDouble();

        // Perform the Double operations
        double result1 = a + b * c;  // First operation: a + (b * c)
        double result2 = a * b + c;  // Second operation: (a * b) + c
        double result3 = c + a / b;  // Third operation: c + (a / b)
        double result4 = a % b + c;  // Fourth operation: (a % b) + c

        // Printing the results
        System.out.println("The results of Int Operations are: " +
                           result1 + ", " + result2 + ", " + result3 + ", and " + result4);

        // Close the scanner
        input.close();
    }
}
