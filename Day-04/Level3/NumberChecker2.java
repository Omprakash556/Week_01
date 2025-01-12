public class NumberChecker2 {

    public static int countDigits(int number) {
        int count = 0;
        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    public static int[] storeDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    public static int sumOfDigits(int number) {
        int[] digits = storeDigits(number);
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    public static int sumOfSquaresOfDigits(int number) {
        int[] digits = storeDigits(number);
        int sumOfSquares = 0;
        for (int digit : digits) {
            sumOfSquares += Math.pow(digit, 2);
        }
        return sumOfSquares;
    }

    public static boolean isHarshadNumber(int number) {
        int sumOfDigits = sumOfDigits(number);
        return number % sumOfDigits == 0;
    }

    public static int[][] digitFrequency(int number) {
        int[] digits = storeDigits(number);
        int[][] frequency = new int[10][2]; 
        
        for (int digit : digits) {
            frequency[digit][0] = digit;  
            frequency[digit][1]++;        
        }

        return frequency;
    }

    public static void main(String[] args) {
        int number = 21; 

        int digitCount = countDigits(number);
        System.out.println("Count of digits: " + digitCount);

        int[] digits = storeDigits(number);
        System.out.print("Digits: ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
        System.out.println();

        int sumOfDigits = sumOfDigits(number);
        System.out.println("Sum of digits: " + sumOfDigits);

        int sumOfSquares = sumOfSquaresOfDigits(number);
        System.out.println("Sum of squares of digits: " + sumOfSquares);

        if (isHarshadNumber(number)) {
            System.out.println(number + " is a Harshad Number.");
        } else {
            System.out.println(number + " is not a Harshad Number.");
        }

        int[][] frequency = digitFrequency(number);
        System.out.println("Frequency of each digit:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i][1] > 0) {
                System.out.println("Digit " + frequency[i][0] + " appears " + frequency[i][1] + " times.");
            }
        }
    }
}
