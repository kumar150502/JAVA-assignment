package javaassignmentday2;
import java.util.Scanner;
public class Operator2SpringSeason {
    public static void main(String[] args) {
        // Get the month and day from the command line
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        int day = scanner.nextInt();

        // Check if the day is between March 20 and June 20
        boolean isSpring = (month == 3 && day >= 20 && day <= 31) || (month == 4 && day >= 1 && day <= 30) || (month == 5 && day >= 1 && day <= 31) || (month == 6 && day >= 1 && day <= 20);

        // Print the result
        System.out.println(isSpring);
    }
}
