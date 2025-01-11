import java.util.Scanner;

public class AreaOfTriangle{
	public static void main(String[] args){
	
	// create scanner object for taking input from user
	Scanner input = new Scanner(System.in);
	
	// declare variable for finding area of traingle
	int base, height;
	
	System.out.println("Enter base: "); // take base from user
	base = input.nextInt();
	
	System.out.println("Enter height: "); // take height from user
	height = input.nextInt();
	
    // Calculate the area of the triangle in square inches
    double areaInches = 0.5 * base * height;

    // Convert base and height to centimeters (1 inch = 2.54 cm)
    double baseCm = base * 2.54;
    double heightCm = height * 2.54;

    // Calculate the area of the triangle in square centimeters
    double areaCm = 0.5 * baseCm * heightCm;

    // Convert height in centimeters to feet and inches
    double heightFeet = heightCm / 30.48; // 1 foot = 30.48 cm
    int feet = (int) heightFeet; // Get the whole number part
    double remainingInches = (heightFeet - feet) * 12;
	
	double area = ((base*height)/2);
	
	System.out.println("The area of traingle is "+area);
	}
}