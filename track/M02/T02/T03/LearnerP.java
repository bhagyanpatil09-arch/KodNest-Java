
import java.util.Scanner;

public class LearnerP {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read input
        String firstName = scanner.nextLine();
        int solvedProblems = scanner.nextInt();
        double assessmentPercentage = scanner.nextDouble();

        // Display the profile
        System.out.println("Learner: " + firstName);
        System.out.println("Problems solved: " + solvedProblems);
        System.out.println("Assessment: " + assessmentPercentage);

        scanner.close();
    }
}
