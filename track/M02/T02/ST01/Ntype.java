
public class Ntype {

    public static void main(String[] args) {
        int number = -7;
        int firstScore = 18;
        int secondScore = 25;

        if (number > 0) {
            System.out.println("Number Type: Positive");
        } else if (number < 0) {
            System.out.println("Number Type: Negative");
        } else {
            System.out.println("Number Type:Zero");
        }

        if (number % 2 == 0) {
            System.out.println("Parity: Even");
        } else {
            System.out.println("Parity: Odd");
        }

        if (firstScore >= secondScore) {
            System.out.println("Larger score: " + firstScore);
        } else {
            System.out.println("Larger score: " + secondScore);
        }
    }
}
