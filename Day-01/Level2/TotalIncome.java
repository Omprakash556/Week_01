import java.util.Scanner;

public class TotalIncome {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Taking salary as input
        System.out.print("Enter the salary (INR): ");
        int salary = input.nextInt();

        // Taking bonus as input
        System.out.print("Enter the bonus (INR): ");
        int bonus = input.nextInt();

        // Calculating total income
        int totalIncome = salary + bonus;

        // Printing the result
        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + ". Hence, Total Income is INR " + totalIncome);

        // Close the scanner
        input.close();
    }
}
