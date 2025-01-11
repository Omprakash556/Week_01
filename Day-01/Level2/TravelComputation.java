import java.util.Scanner;

public class TravelComputation {

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Input the traveler name
        System.out.print("Enter the traveler's name: ");
        String name = input.nextLine();

        // Input the city name
        System.out.print("Enter the starting city: ");
        String fromCity = input.nextLine();
        
        System.out.print("Enter the via city: ");
        String viaCity = input.nextLine();

        System.out.print("Enter the destination city: ");
        String toCity = input.nextLine();

        // Input the distance and time 
        System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " (in km): ");
        double distanceFromToVia = input.nextDouble();

        System.out.print("Enter the time taken from " + fromCity + " to " + viaCity + " (in minutes): ");
        int timeFromToVia = input.nextInt();

        System.out.print("Enter the distance from " + viaCity + " to " + toCity + " (in km): ");
        double distanceViaToFinalCity = input.nextDouble();

        System.out.print("Enter the time taken from " + viaCity + " to " + toCity + " (in minutes): ");
        int timeViaToFinalCity = input.nextInt();

        // Calculate total distance and total time
        double totalDistance = distanceFromToVia + distanceViaToFinalCity;
        int totalTime = timeFromToVia + timeViaToFinalCity;

        // Print the travel details
        System.out.println("The Total Distance travelled by " + name + " from " +
                fromCity + " to " + toCity + " via " + viaCity +
                " is " + totalDistance + " km and " +
                "the Total Time taken is " + totalTime + " minutes");

        // Close the scanner
        input.close();
    }
}
