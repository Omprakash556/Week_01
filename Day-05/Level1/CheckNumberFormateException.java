import java.util.Scanner;

public class CheckNumberFormateException {

    // Method to generate NumberFormatException
    public static void generateNumberFormatExcep(String text) {
		
        System.out.println(Integer.parseInt(text));  
    }

    // Method to demonstrate handling NumberFormatException
    public static void handleNumberFormatExcep(String text) {
        try {
            System.out.println(Integer.parseInt(text));
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e);
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking user input for the string 
        System.out.print("Enter a string to convert to a number: ");
        String text = input.nextLine();

        // Call the method to generate the exception
        System.out.println("\nCalling method to generate NumberFormatException...");
        generateNumberFormatExcep(text);

        // Call the method to handle the exception
        System.out.println("\nCalling method to handle NumberFormatException...");
        handleNumberFormatExcep(text);

        input.close();
    }
}
