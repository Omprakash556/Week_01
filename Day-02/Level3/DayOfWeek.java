import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        // Scanner to take input from user for month, day, and year
        Scanner scanner = new Scanner(System.in);

        // Take month, day, and year as input
        System.out.print("Enter the month (1 for January, 2 for February, etc.): ");
        int m = scanner.nextInt();

        System.out.print("Enter the day (1 to 31): ");
        int d = scanner.nextInt();

        System.out.print("Enter the year (e.g., 2023): ");
        int y = scanner.nextInt();

        // Apply the given formulas to calculate the day of the week
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + 31 * m0 / 12) % 7;

        // Output the day of the week as per the calculated value of d0
        System.out.println("The day of the week is: " + d0);
        switch (d0) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
        }

        // Close the scanner
        scanner.close();
    }
}
