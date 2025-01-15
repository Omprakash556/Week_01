import java.util.Random;

public class ScoreOfStudents {
	// Step 1: Generate random scores for Physics, Chemistry, and Math
    public static int[][] generateScores(int numStudents) {
        Random random = new Random();
        int[][] scores = new int[numStudents][3]; // 3 subjects: PCM
        for (int i = 0; i < numStudents; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = random.nextInt(41) + 60; // Random scores between 60 and 100
            }
        }
        return scores;
    }

    // Step 2: Calculate total, average, and percentage
    public static double[][] calculateResults(int[][] scores) {
        int numStudents = scores.length;
        double[][] results = new double[numStudents][3]; // Total, Average, Percentage
        for (int i = 0; i < numStudents; i++) {
            int total = 0;
            for (int score : scores[i]) {
                total += score;
            }
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0; // Round to 2 decimal places
            results[i][2] = Math.round(percentage * 100.0) / 100.0; // Round to 2 decimal places
        }
        return results;
    }

    // Step 3: Assign grades based on the percentage
    public static String[] assignGrades(double[][] results) {
        String[] grades = new String[results.length];
        for (int i = 0; i < results.length; i++) {
            double percentage = results[i][2];
            if (percentage >= 80) {
                grades[i] = "A";
            } else if (percentage >= 70) {
                grades[i] = "B";
            } else if (percentage >= 60) {
                grades[i] = "C";
            } else if (percentage >= 50) {
                grades[i] = "D";
            } else if (percentage >= 40) {
                grades[i] = "E";
            } else {
                grades[i] = "R";
            }
        }
        return grades;
    }

    // Step 4: Display the scorecard in a tabular format using println
    public static void displayScorecard(int[][] scores, double[][] results, String[] grades) {
    // Print headers
    System.out.println("Student Details:");
    System.out.println("------------------------------------------");
    System.out.println("Student | Physics | Chemistry | Math | Total | Average | Percentage | Grade");

    // Print data for each student
    for (int i = 0; i < scores.length; i++) {
        System.out.println("------------------------------------------");
        System.out.println("Student " + (i + 1));
        System.out.println("Physics: " + scores[i][0]);
        System.out.println("Chemistry: " + scores[i][1]);
        System.out.println("Math: " + scores[i][2]);
        System.out.println("Total: " + (int) results[i][0]);
        System.out.println("Average: " + results[i][1]);
        System.out.println("Percentage: " + results[i][2]);
        System.out.println("Grade: " + grades[i]);
        System.out.println("------------------------------------------");
    }
}


    public static void main(String[] args) {
        int numStudents = 5; // Number of students
        int[][] scores = generateScores(numStudents);
        double[][] results = calculateResults(scores);
        String[] grades = assignGrades(results);
        displayScorecard(scores, results, grades);
    }
}
