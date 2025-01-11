
    import java.util.Scanner;

    public class NumberCheck {

        public static void main(String[] args) {
            // Create a Scanner object
            Scanner scanner = new Scanner(System.in);

            // Input the number
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            // Check if the number is positive, negative, or zero
            if (number > 0) {
                System.out.println("Positive");
            } else if (number < 0) {
                System.out.println("Negative");
            } else {
                System.out.println("Zero");
            }

            // Close the scanner
            scanner.close();
        }
    }


