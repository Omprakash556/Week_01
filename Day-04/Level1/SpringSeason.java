public class SpringSeason {

    // Method to check if the given month and day is within the Spring season
    public static boolean isSpringSeason(int month, int day) {
        // Check if the month is between March (3) and June (6)
        if (month > 3 && month < 6) {
            return true;  // Between March and June
        } else if (month == 3 && day >= 20) {
            return true;  // After or on March 20th
        } else if (month == 6 && day <= 20) {
            return true;  // Before or on June 20th
        } else {
            return false;  // Outside the Spring season
        }
    }

    public static void main(String[] args) {
        // Check if we have exactly two arguments (month and day)
        if (args.length != 2) {
            System.out.println("Please provide both month and day.");
            return;
        }

        // Get the month and day from the command line arguments
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        // Check if the provided month and day form a valid Spring season date
        if (isSpringSeason(month, day)) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}




