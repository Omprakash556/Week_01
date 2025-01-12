import java.util.Random;

public class EmployeeBonus {
    
    public static double[][] generateEmployeeData(int numEmployees) {
        Random random = new Random();
        double[][] employeeData = new double[numEmployees][2]; 
        
        for (int i = 0; i < numEmployees; i++) {
            // Generate a random salary between 10000 and 99999
            employeeData[i][0] = 10000 + (random.nextInt(90000));
            // Generate a random years of service between 1 and 20
            employeeData[i][1] = 1 + random.nextInt(20);
        }
        
        return employeeData;
    }
    
    // Method to calculate the bonus and new salary based on years of service
    public static double[][] calculateBonusAndSalary(double[][] employeeData) {
        double[][] updatedData = new double[employeeData.length][3]; // 3 columns: salary, years of service, new salary + bonus
        
        for (int i = 0; i < employeeData.length; i++) {
            double salary = employeeData[i][0];
            double yearsOfService = employeeData[i][1];
            double bonus = 0;
            
            // Check bonus percentage based on years of service
            if (yearsOfService > 5) {
                bonus = salary * 0.05;  // 5% bonus
            } else {
                bonus = salary * 0.02;  // 2% bonus
            }
            
            double newSalary = salary + bonus;
            updatedData[i][0] = salary;     // Old salary
            updatedData[i][1] = bonus;      // Bonus amount
            updatedData[i][2] = newSalary;  // New salary after adding the bonus
        }
        
        return updatedData;
    }
    
    // Method to calculate the total old salary, total new salary, and total bonus
    public static void calculateTotalAndDisplay(double[][] updatedData) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;
        
        // Calculate totals
        for (int i = 0; i < updatedData.length; i++) {
            totalOldSalary += updatedData[i][0];
            totalBonus += updatedData[i][1];
            totalNewSalary += updatedData[i][2];
        }
        
        // Display results in tabular format
        System.out.println("Employee | Old Salary | Bonus Amount | New Salary");
        System.out.println("----------------------------------------------------");
        
        for (int i = 0; i < updatedData.length; i++) {
            System.out.println((i + 1) + "        | " + updatedData[i][0] + "      | " + updatedData[i][1] + "        | " + updatedData[i][2]);
        }
        
        System.out.println("----------------------------------------------------");
        System.out.println("Total    | " + totalOldSalary + "      | " + totalBonus + "        | " + totalNewSalary);
    }

    public static void main(String[] args) {
        int numEmployees = 10;
        
        // Generate random data for employees
        double[][] employeeData = generateEmployeeData(numEmployees);
        
        // Calculate bonus and new salary
        double[][] updatedData = calculateBonusAndSalary(employeeData);
        
        // Calculate and display totals in tabular format
        calculateTotalAndDisplay(updatedData);
    }
}
