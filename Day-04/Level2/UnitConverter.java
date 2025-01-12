public class UnitConverter {

    // Method to convert kilometers to miles
    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371; // Conversion factor
        return km * km2miles;
    }

    // Method to convert miles to kilometers
    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934; // Conversion factor
        return miles * miles2km;
    }

    // Method to convert meters to feet
    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084; // Conversion factor
        return meters * meters2feet;
    }

    // Method to convert feet to meters
    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048; // Conversion factor
        return feet * feet2meters;
    }

    public static void main(String[] args) {

        // Convert kilometers to miles
        double km = 10.0;
        double miles = convertKmToMiles(km);
        System.out.println(km + " kilometers is equal to " + miles + " miles.");

        // Convert miles to kilometers
        double milesInput = 6.2;
        double kmOutput = convertMilesToKm(milesInput);
        System.out.println(milesInput + " miles is equal to " + kmOutput + " kilometers.");

        // Convert meters to feet
        double meters = 100.0;
        double feet = convertMetersToFeet(meters);
        System.out.println(meters + " meters is equal to " + feet + " feet.");

        // Convert feet to meters
        double feetInput = 328.084;
        double metersOutput = convertFeetToMeters(feetInput);
        System.out.println(feetInput + " feet is equal to " + metersOutput + " meters.");
    }
}
