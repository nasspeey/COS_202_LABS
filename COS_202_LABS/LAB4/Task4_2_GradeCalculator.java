import java.util.Scanner;

public class Task4_2_GradeCalculator {
    // Assumed grading ladder (section 4.4 was not supplied): edit the cut-offs if your handout differs.
    //  70-100 A | 60-69 B | 50-59 C | 45-49 D | 40-44 E | 0-39 F
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter score (0-100): ");
        double score = in.nextDouble();
        if (score < 0 || score > 100) {
            System.out.println("Invalid score: must be between 0 and 100.");
        } else if (score >= 70) {
            System.out.println("Grade: A");
        } else if (score >= 60) {
            System.out.println("Grade: B");
        } else if (score >= 50) {
            System.out.println("Grade: C");
        } else if (score >= 45) {
            System.out.println("Grade: D");
        } else if (score >= 40) {
            System.out.println("Grade: E");
        } else {
            System.out.println("Grade: F");
        }
        in.close();
    }
}
