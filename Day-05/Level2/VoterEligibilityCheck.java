import java.util.Scanner;

public class VoterEligibilityCheck {

    // Method to generate random 2-digit ages for a number of students
    public static int[] generateStudentAges(int numberOfStudents) {
        int[] ages = new int[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++) {
            ages[i] = 18 + (int)(Math.random() * (100 - 18));  // Random age between 18 and 100
        }
        return ages;
    }

    // Method to check voting eligibility based on age and return a 2D array with age and voting status
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];  // 2D array to store age and voting status
        
        for (int i = 0; i < ages.length; i++) {
            int age = ages[i];
            
            if (age < 0) {
                result[i][0] = String.valueOf(age);
                result[i][1] = "Cannot Vote (Invalid Age)";
            } else if (age >= 18) {
                result[i][0] = String.valueOf(age);
                result[i][1] = "Can Vote";
            } else {
                result[i][0] = String.valueOf(age);
                result[i][1] = "Cannot Vote";
            }
        }
        
        return result;
    }

    // Method to display the 2D array in a tabular format
    public static void displayVotingEligibility(String[][] eligibilityData) {
        // Display the table header
        System.out.println("Age\t\tVoting Eligibility");
        System.out.println("------------------------------");

        // Display each student's age and voting eligibility
        for (int i = 0; i < eligibilityData.length; i++) {
            System.out.println(eligibilityData[i][0] + "\t\t" + eligibilityData[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input for the number of students
        System.out.println("Enter the number of students:");
        int numberOfStudents = 10;  // As per the requirement, there are 10 students

        // Generate random ages for the students
        int[] studentAges = generateStudentAges(numberOfStudents);

        // Check voting eligibility for each student based on their age
        String[][] votingEligibility = checkVotingEligibility(studentAges);

        // Display the voting eligibility results in a tabular format
        displayVotingEligibility(votingEligibility);

        // Close the scanner
        input.close();
    }
}
