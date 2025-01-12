public class UnitConverter3 {

    //  Convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        double fahrenheit2celsius = (fahrenheit - 32) * 5 / 9; // Conversion formula
        return fahrenheit2celsius;
    }

    // Convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        double celsius2fahrenheit = (celsius * 9 / 5) + 32; // Conversion formula
        return celsius2fahrenheit;
    }

    // Convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592; // Conversion factor
        return pounds * pounds2kilograms;
    }

    // Convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462; // Conversion factor
        return kilograms * kilograms2pounds;
    }

    // Convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541; // Conversion factor
        return gallons * gallons2liters;
    }

    // Convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172; // Conversion factor
        return liters * liters2gallons;
    }

    public static void main(String[] args) {

        // Convert Fahrenheit to Celsius
        double fahrenheit = 100.0;
        double celsiusFromFahrenheit = convertFahrenheitToCelsius(fahrenheit);
        System.out.println(fahrenheit + " Fahrenheit is equal to " + celsiusFromFahrenheit + " Celsius.");

        // Convert Celsius to Fahrenheit
        double celsius = 37.0;
        double fahrenheitFromCelsius = convertCelsiusToFahrenheit(celsius);
        System.out.println(celsius + " Celsius is equal to " + fahrenheitFromCelsius + " Fahrenheit.");

        // Convert pounds to kilograms
        double pounds = 150.0;
        double kilogramsFromPounds = convertPoundsToKilograms(pounds);
        System.out.println(pounds + " pounds is equal to " + kilogramsFromPounds + " kilograms.");

        // Convert kilograms to pounds
        double kilograms = 70.0;
        double poundsFromKilograms = convertKilogramsToPounds(kilograms);
        System.out.println(kilograms + " kilograms is equal to " + poundsFromKilograms + " pounds.");

        // Convert gallons to liters
        double gallons = 5.0;
        double litersFromGallons = convertGallonsToLiters(gallons);
        System.out.println(gallons + " gallons is equal to " + litersFromGallons + " liters.");

        // Convert liters to gallons
        double liters = 10.0;
        double gallonsFromLiters = convertLitersToGallons(liters);
        System.out.println(liters + " liters is equal to " + gallonsFromLiters + " gallons.");
    }
}
