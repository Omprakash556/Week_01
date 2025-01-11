import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Take the number input from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Using a for loop to calculate and print the multiplication table from 6 to 9
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }

        // Close the scanner
        scanner.close();
    }
}
