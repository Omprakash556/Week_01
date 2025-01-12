import java.util.Random;

public class RandomNumberStatsFinding {

    // Method to generate an array of 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];
        Random rand = new Random();
        
        // Generate 4-digit random numbers (between 1000 and 9999)
        for (int i = 0; i < size; i++) {
            numbers[i] = 1000 + rand.nextInt(9000); // Random number between 1000 and 9999
        }
        
        return numbers;
    }

    // Method to calculate the average, minimum, and maximum values of an array
    public static double[] findAverageMinMax(int[] numbers) {
        double sum = 0;
        int min = numbers[0];
        int max = numbers[0];
        
        // Calculate the sum, min, and max values
        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        // Calculate the average
        double average = sum / numbers.length;
        
        // Return the average, min, and max values
        return new double[] {average, min, max};
    }

    public static void main(String[] args) {
        // Generate an array of 5 random 4-digit numbers
        int[] randomNumbers = generate4DigitRandomArray(5);
        
        // Print the generated random numbers
        System.out.println("Generated Random Numbers:");
        for (int num : randomNumbers) {
            System.out.print(num + " ");
        }
        System.out.println();  // Print a newline for better output formatting
        
        // Find the average, min, and max values
        double[] result = findAverageMinMax(randomNumbers);
        
        // Display the results
        System.out.println("Average: " + result[0]);
        System.out.println("Minimum Value: " + result[1]);
        System.out.println("Maximum Value: " + result[2]);
    }
}
