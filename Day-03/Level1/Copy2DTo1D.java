import java.util.Scanner;

public class Copy2DTo1D {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Take input for the number of rows and columns
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        // Create a 2D array
        int[][] matrix = new int[rows][columns];

        // Take input for the elements
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Element at position [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Create a 1D array to store the elements of the 2D array
        int[] array = new int[rows * columns];

        // Copy elements from the 2D array to the 1D array
        int index = 0;  // Index variable for the 1D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[index++] = matrix[i][j];  // Copy the element and increment the index
            }
        }

        // Display the 1D array
        System.out.println("The 1D array after copying the elements from the 2D array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        // Close the scanner
        scanner.close();
    }
}
