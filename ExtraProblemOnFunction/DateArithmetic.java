import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateArithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a date (YYYY-MM-DD):");
        String inputDate = input.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // Parse the input date
        LocalDate date = LocalDate.parse(inputDate, formatter);

        // Add 7 days, 1 month, and 2 years
        LocalDate updatedDate = date.plusDays(7) // Adds 7 days
                .plusMonths(1) // Adds 1 month
                .plusYears(2); // Adds 2 years

        // Subtract 3 weeks from the result
        updatedDate = updatedDate.minusWeeks(3); // Subtracts 3 weeks

        // Output the final updated date
        System.out.println("Updated date: " + updatedDate);
    }
}
