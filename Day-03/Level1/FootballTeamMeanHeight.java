import java.util.Scanner;

public class FootballTeamMeanHeight {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner input = new Scanner(System.in);
        
        // Create an array to store the heights of the players
        double[] heights = new double[11];
        
        // Variable to store the sum
        double sum = 0.0;
        
        // Get input for the heights from the user
        System.out.println("Enter the heights of the 11 players:");
        for (int i = 0; i < 11; i++) {
            System.out.print("Player " + (i + 1) + " height: ");
            heights[i] = input.nextDouble();
            sum += heights[i];  // Add each height
        }
        
        // Calculate the mean height
        double meanHeight = sum / 11;
        
        // Print the mean height
        System.out.println("The mean height of the football team is: " + meanHeight);
        
        // Close the scanner
        input.close();
    }
}
