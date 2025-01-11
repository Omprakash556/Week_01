import java.util.Scanner;

public class YoungestTallestFriends {

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Take user input for age and height of Amar, Akbar, and Anthony
        System.out.print("Enter the age of Amar: ");
        int amarAge = scanner.nextInt();
        System.out.print("Enter the height of Amar (in cm): ");
        int amarHeight = scanner.nextInt();

        System.out.print("Enter the age of Akbar: ");
        int akbarAge = scanner.nextInt();
        System.out.print("Enter the height of Akbar (in cm): ");
        int akbarHeight = scanner.nextInt();

        System.out.print("Enter the age of Anthony: ");
        int anthonyAge = scanner.nextInt();
        System.out.print("Enter the height of Anthony (in cm): ");
        int anthonyHeight = scanner.nextInt();

        // Find the youngest friend (smallest age)
        int youngestAge = amarAge;
        String youngestFriend = "Amar";

        if (akbarAge < youngestAge) {
            youngestAge = akbarAge;
            youngestFriend = "Akbar";
        }
        if (anthonyAge < youngestAge) {
            youngestAge = anthonyAge;
            youngestFriend = "Anthony";
        }

        // Find the tallest friend
        int tallestHeight = amarHeight;
        String tallestFriend = "Amar";

        if (akbarHeight > tallestHeight) {
            tallestHeight = akbarHeight;
            tallestFriend = "Akbar";
        }
        if (anthonyHeight > tallestHeight) {
            tallestHeight = anthonyHeight;
            tallestFriend = "Anthony";
        }

        // Output the results
        System.out.println("The youngest friend is " + youngestFriend + " with age " + youngestAge + " years.");
        System.out.println("The tallest friend is " + tallestFriend + " with height " + tallestHeight + " cm.");

        // Close the scanner
        scanner.close();
    }
}
