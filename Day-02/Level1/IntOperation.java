import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Taking three integer inputs: a, b, and c
        System.out.print("Enter the value of a: ");
        int a = input.nextInt();
        System.out.print("Enter the value of b: ");
        int b = input.nextInt();
        System.out.print("Enter the value of c: ");
        int c = input.nextInt();

        // Perform the integer operations
        int result1 = a + b * c;  // First operation: a + (b * c)
        int result2 = a * b + c;  // Second operation: (a * b) + c
        int result3 = c + a / b;  // Third operation: c + (a / b)
        int result4 = a % b + c;  // Fourth operation: (a % b) + c

        // Printing the results
        System.out.println("The results of Int Operations are: " +
                           result1 + ", " + result2 + ", " + result3 + ", and " + result4);

        // Close the scanner
        input.close();
    }
}
