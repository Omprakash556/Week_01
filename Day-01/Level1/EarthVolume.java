public class EarthVolume {
    public static void main(String[] args) {
        // Constants
        double radiusKm = 6378; // Radius of Earth in kilometers
        double pi = Math.PI;    // Value of Pi
        
        // Calculate volume in cubic kilometers
        double volumeKmCubed = (4.0 / 3.0)*pi * Math.pow(radiusKm, 3);
        
        // Convert volume to cubic miles (1 km^3 = 0.239913 cubic miles)
        double volumeMilescubed = volumeKmCubed * 0.239913;
        
        // Display the results
        System.out.println("The volume of earth in cubic kilometers is"+volumeKmCubed+" and cubic miles is ____"+volumeMilescubed);
       
    }
}

