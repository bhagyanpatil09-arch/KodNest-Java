
import java.util.Scanner;

public class Loop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int days = scanner.nextInt();

        int total = 0;

        for (int i = 1; i <= days; i++) {
            int problems = scanner.nextInt();
            total = total + problems;
        }

        String status;

        if (total >= 20) {
            status = "Strong progress";
        } else if (total >= 10) {
            status = "Keep improving";
        } else {
            status = "Needs more practice";
        }

        System.out.println("Total problems solved: " + total);
        System.out.println("Progress status: " + status);

        scanner.close();
    }
}
