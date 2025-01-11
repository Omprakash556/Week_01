import java.util.Scanner;

public class ZaraBonusCalculator {
    public static void main(String[] args) {
        // Create a Scanner object 
        Scanner input = new Scanner(System.in);
        
        // Define arrays for salary, years of service, bonus, and new salary
        double[] salaries = new double[10];
        int[] yearsOfService = new int[10];
        double[] bonuses = new double[10];
        double[] newSalaries = new double[10];
        
        // Variables to store the total bonus, total old salary, and total new salary
        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        // Loop to get input for 10 employees
        for (int i = 0; i < 10; i++) {
            // Input validation for salary and years of service
            while (true) {
                System.out.print("Enter salary for employee " + (i + 1) + ": ");
                double salary = input.nextDouble();
                if (salary < 0) {
                    System.out.println("Salary cannot be negative. Please enter a valid salary.");
                    continue;
                }
                
                System.out.print("Enter years of service for employee " + (i + 1) + ": ");
                int years = input.nextInt();
                if (years < 0) {
                    System.out.println("Years of service cannot be negative. Please enter a valid number.");
                    continue;
                }

                // Store valid input
                salaries[i] = salary;
                yearsOfService[i] = years;
                break;  // Exit the loop
            }
        }

        // Loop to calculate bonus and new salary for each employee
        for (int i = 0; i < 10; i++) {
            double bonus = 0.0;
            if (yearsOfService[i] > 5) {
                bonus = salaries[i] * 0.05;
            } else {
                bonus = salaries[i] * 0.02;  
            }
            bonuses[i] = bonus;
            newSalaries[i] = salaries[i] + bonus;

            totalBonus += bonus;
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }

        // Display the results
        System.out.println("\nTotal Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);

        // Close the scanner
        input.close();
    }
}
