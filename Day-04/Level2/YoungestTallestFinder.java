import java.util.Scanner;

public class YoungestTallestFinder {

    // Method to find the youngest among the three friends
    public static String findYoungest(int[] ages, String[] names) {
        int youngestAge = ages[0];
        String youngestFriend = names[0];

        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < youngestAge) {
                youngestAge = ages[i];
                youngestFriend = names[i];
            }
        }
        return youngestFriend;
    }

    // Method to find the tallest among the three friends
    public static String findTallest(double[] heights, String[] names) {
        double tallestHeight = heights[0];
        String tallestFriend = names[0];

        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > tallestHeight) {
                tallestHeight = heights[i];
                tallestFriend = names[i];
            }
        }
        return tallestFriend;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Names of the friends
        String[] names = {"Amar", "Akbar", "Anthony"};

        // Arrays to store age and height of the friends
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Input age and height for each friend
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the age of " + names[i] + ": ");
            ages[i] = input.nextInt();

            System.out.print("Enter the height of " + names[i] + " (in meters): ");
            heights[i] = input.nextDouble();
        }

        // Find the youngest and the tallest
        String youngest = findYoungest(ages, names);
        String tallest = findTallest(heights, names);

        // Output the results
        System.out.println("The youngest friend is: " + youngest);
        System.out.println("The tallest friend is: " + tallest);

        input.close();
    }
}
