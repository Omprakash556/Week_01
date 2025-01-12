import java.util.Scanner;

public class StudentVoteChecker {

    // Method to check if a student can vote based on age
    public boolean canStudentVote(int age) {
        // Validate if the age is negative
        if (age < 0) {
            return false; 
        }
        
        if (age >= 18) {
            return true;
        } else {
            return false; 
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create an array to hold the ages of 10 students
        int[] studentAges = new int[10];

        // Create an instance of StudentVoteChecker 
        StudentVoteChecker checker = new StudentVoteChecker();

        // Loop through the array to take input 
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter the age of student " + (i + 1) + ": ");
            studentAges[i] = input.nextInt();

            // Call canStudentVote()
            boolean canVote = checker.canStudentVote(studentAges[i]);

            // Display the result
            if (canVote) {
                System.out.println("Student " + (i + 1) + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " cannot vote.");
            }
        }

        input.close(); // Close the scanner
    }
}
