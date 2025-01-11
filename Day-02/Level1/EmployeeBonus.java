import java.util.Scanner;

public class EmployeeBonus {

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Take employee's salary as input
        System.out.print("Enter the salary of the employee: ");
        double salary = scanner.nextDouble();

        // Take the years of service as input
        System.out.print("Enter the years of service: ");
        int yearsOfService = scanner.nextInt();

        // Check if the employee's years of service is greater than 5
        if (yearsOfService > 5) {
            // Calculate 5% bonus if the employee has more than 5 years of service
            double bonus = salary * 0.05;
            System.out.println("The bonus amount is: " + bonus);
        } else {
            System.out.println("No bonus as years of service are 5 or less.");
        }

        // Close the scanner
        scanner.close();
    }
}
