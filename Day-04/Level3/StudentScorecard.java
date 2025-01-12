import java.util.Random;
import java.util.Scanner;

public class StudentScorecard {
    
    // Method to generate random 2-digit scores for PCM for all students
    public static int[][] generateRandomScores(int numStudents) {
        Random random = new Random();
        int[][] scores = new int[numStudents][3];  // 3 columns: Physics, Chemistry, Math
        
        for (int i = 0; i < numStudents; i++) {
            // Generate random scores between 10 and 99 for each subject
            scores[i][0] = 10 + random.nextInt(90); // Physics score
            scores[i][1] = 10 + random.nextInt(90); // Chemistry score
            scores[i][2] = 10 + random.nextInt(90); // Math score
        }
        
        return scores;
    }
    
    // Method to calculate total, average, and percentage for each student
    public static double[][] calculateMetrics(int[][] scores) {
        double[][] metrics = new double[scores.length][4]; // 4 columns: Total, Average, Percentage, Rounded Percentage
        
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2]; // Total score for each student
            double average = total / 3.0; // Average score
            double percentage = (total / 300.0) * 100; // Percentage calculation (out of 300)
            
            // Round off to 2 decimal places using Math.round()
            metrics[i][0] = total;
            metrics[i][1] = average;
            metrics[i][2] = percentage;
            metrics[i][3] = Math.round(percentage * 100.0) / 100.0; // Rounded percentage to 2 decimal places
        }
        
        return metrics;
    }
    
    // Method to display the scorecard in tabular format
    public static void displayScorecard(int[][] scores, double[][] metrics) {
        System.out.println("Student | Physics | Chemistry | Math | Total | Average | Percentage");
        System.out.println("---------------------------------------------------------------");
        
        for (int i = 0; i < scores.length; i++) {
            System.out.println((i + 1) + "\t\t" + scores[i][0] + "\t\t" + scores[i][1] + "\t\t" + 
                               scores[i][2] + "\t\t" + metrics[i][0] + "\t\t" + metrics[i][1] + "\t\t" + 
                               metrics[i][3]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input for the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        
        // Generate random scores for the students
        int[][] studentScores = generateRandomScores(numStudents);
        
        // Calculate the total, average, and percentage for each student
        double[][] metrics = calculateMetrics(studentScores);
        
        // Display the scorecard for all students
        displayScorecard(studentScores, metrics);
        
        scanner.close();
    }
}
