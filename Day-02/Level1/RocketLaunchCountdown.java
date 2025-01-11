
        import java.util.Scanner;

        public class RocketLaunchCountdown {

            public static void main(String[] args) {
                // Create a Scanner object
                Scanner scanner = new Scanner(System.in);

                // Input the starting value for the countdown
                System.out.print("Enter the countdown starting number: ");
                int counter = scanner.nextInt();

                // Use a while loop to countdown
                while (counter >= 1) {
                    System.out.println(counter);  // Print the current value of counter
                    counter--;  // Decrement the counter
                }

                // Print a message when the countdown is complete
                System.out.println("Launch!");

                // Close the scanner
                scanner.close();
            }
        }


