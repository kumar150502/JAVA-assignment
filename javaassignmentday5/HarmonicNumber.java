package javaassignmentday5;
import java.util.Scanner;
public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the harmonic number value: ");
        int n = scanner.nextInt();

        double harmonicNumber = 0.0;
        for (int i = 1; i <= n; i++) {
            harmonicNumber += 1.0 / i;
        }

        System.out.println("The " + n + "th harmonic number is: " + harmonicNumber);
    }
}
