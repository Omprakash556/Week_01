import java.util.Scanner;

public class YoungestAndTallestUsingArray {

    public static void main(String[] args) {
		// Ctreate a Scanner Object
        Scanner input = new Scanner(System.in);
        
        // Arrays to store age and height of the 3 friends
        int[] ages = new int[3];
        double[] heights = new double[3];
        String[] names = {"Amar", "Akbar", "Anthony"};
        
        // Input for ages and heights
        System.out.println("Enter the age and height for Amar:");
        ages[0] = input.nextInt();
        heights[0] = input.nextDouble();
        
        System.out.println("Enter the age and height for Akbar:");
        ages[1] = input.nextInt();
        heights[1] = input.nextDouble();
        
        System.out.println("Enter the age and height for Anthony:");
        ages[2] = input.nextInt();
        heights[2] = input.nextDouble();
        
        // Find the youngest friend
        int youngestIndex = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
        }
        
        // Find the tallest friend
        int tallestIndex = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }
        
        // Display the youngest and tallest friend
        System.out.println("The youngest friend is: " + names[youngestIndex]);
        System.out.println("The tallest friend is: " + names[tallestIndex]);
		
		// close the Scanner
		input.close();
		
    }
}
