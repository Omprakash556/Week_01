import java.util.Scanner;
public class RocketLaunchCountDownUsingForLoop {

        public static void main(String[] args) {
            // Create a Scanner object
            Scanner scanner = new Scanner(System.in);

            // Input the starting value for the countdown
            System.out.print("Enter the countdown starting number: ");
            int counter = scanner.nextInt();

            // Use a for loop to countdown from the counter value to 1
            for (int i = counter; i >= 1; i--) {
                System.out.println(i);  // Print the current value of i
            }

            // Print a message when the countdown is complete
            System.out.println("Launch!");

            // Close the scanner
            scanner.close();
        }
    }


