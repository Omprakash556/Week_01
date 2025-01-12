import java.util.Arrays;

public class OTPGenerator {

    public static int generateOTP() {
        return (int) (Math.random() * 900000) + 100000;
    }

    public static boolean areOTPsUnique(int[] otpArray) {
        // Sort the array first to make comparison easier
        Arrays.sort(otpArray);
        
        // Check if any two consecutive OTPs are the same
        for (int i = 0; i < otpArray.length - 1; i++) {
            if (otpArray[i] == otpArray[i + 1]) {
                return false; // OTPs are not unique
            }
        }
        return true; // OTPs are unique
    }

    public static void main(String[] args) {
        int[] otpArray = new int[10]; // Array to store 10 OTP numbers

        // Generate 10 OTP numbers and store them in the array
        for (int i = 0; i < otpArray.length; i++) {
            otpArray[i] = generateOTP();
            System.out.println("Generated OTP " + (i + 1) + ": " + otpArray[i]);
        }

        // Check if the generated OTPs are unique
        if (areOTPsUnique(otpArray)) {
            System.out.println("\nAll OTPs are unique.");
        } else {
            System.out.println("\nSome OTPs are not unique.");
        }
    }
}
