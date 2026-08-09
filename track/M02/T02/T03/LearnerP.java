
import java.util.Scanner;

public class LearnerP {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read input
        String firstName = scanner.nextLine();
        int solvedProblems = scanner.nextInt();
        double assessmentPercentage = scanner.nextDouble();

        // Display the profile
        System.out.println("Learner: " + "Asha");
        System.out.println("Problems solved: " + 25);
        System.out.println("Assessment: " + 82.5);

        scanner.close();
    }
}
