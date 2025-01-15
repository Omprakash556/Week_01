import java.util.Scanner;

public class CheckArrayException {

    // Method to generate ArrayIndexOutOfBoundsException
    public static void generateException(String[] names) {
        System.out.println("Generating ArrayIndexOutOfBoundsException...");
        // Intentionally access an out-of-bounds index
        System.out.println("Accessing index 10: " + names[names.length+1]);
    }

    // Method to handle ArrayIndexOutOfBoundsException
    public static void handleException(String[] names) {
        System.out.println("Handling ArrayIndexOutOfBoundsException...");
        try {
            // Intentionally access an out-of-bounds index
		System.out.println("Accessing index 10: " + names[names.length+1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught a RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take array size and elements from the user
        System.out.println("Enter the number of names:");
        int size = input.nextInt();
        input.nextLine(); // Consume the newline character

        String[] names = new String[size];
        System.out.println("Enter the names:");
        for (int i = 0; i < size; i++) {
            names[i] = input.nextLine();
        }

        // Call the method to generate the exception
        try {
            generateException(names);
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }

        // Call the method to handle the exception
        handleException(names);

        input.close();
    }
}
