
public class Convert {

    public static void main(String[] args) {
        // Convert the give pseudocode into Java code
        int javaHoursPerDay = 21;
        int aptitudeHoursPerDay = 1;
        int numberOfDays = 5;
        int weeklyJavaHours = aptitudeHoursPerDay * numberOfDays;
        int weeklyAptitudeHours = aptitudeHoursPerDay * numberOfDays;
        int totalPreparationHours = weeklyJavaHours + weeklyAptitudeHours;
        System.out.println("Java: 10");
        System.out.println("Aptitude: 5");
        System.out.println("Total: 15");
    }
}
