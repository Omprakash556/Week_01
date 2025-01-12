import java.util.Random;

public class FootballTeam {

    // Method to generate random heights 
    public static int[] generateRandomHeights(int size) {
        Random random = new Random();
        int[] heights = new int[size];
        
        for (int i = 0; i < size; i++) {
            heights[i] = 150 + random.nextInt(101); // Random number between 150 and 250 (inclusive)
        }
        
        return heights;
    }

    // Method to find the sum of all the elements
    public static int findSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    // Method to find the mean height
    public static double findMean(int[] heights) {
        int sum = findSum(heights); // Reuse the findSum method
        return (double) sum / heights.length;
    }

    // Method to find the shortest height 
    public static int findShortest(int[] heights) {
        int shortest = heights[0];
        for (int height : heights) {
            if (height < shortest) {
                shortest = height;
            }
        }
        return shortest;
    }

    // Method to find the tallest height in the array
    public static int findTallest(int[] heights) {
        int tallest = heights[0];
        for (int height : heights) {
            if (height > tallest) {
                tallest = height;
            }
        }
        return tallest;
    }

    public static void main(String[] args) {
        int teamSize = 11; // Number of players in the football team
        int[] heights = generateRandomHeights(teamSize); // Generate random heights for the players
        
        // Find and display the results
        int sum = findSum(heights);
        double mean = findMean(heights);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);

        System.out.println("Heights of the players: ");
        for (int height : heights) {
            System.out.print(height + " ");
        }
        System.out.println("\n");

        System.out.println("Sum of heights: " + sum + " cm");
        System.out.println("Mean height: " + mean + " cm");
        System.out.println("Shortest height: " + shortest + " cm");
        System.out.println("Tallest height: " + tallest + " cm");
    }
}
