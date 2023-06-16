package javaassignmentday2;
import java.util.Scanner;
public class Operator3Quadratic {
        public static void main(String[] args) {
            // coefficients a, b, and c
            Scanner scanner = new Scanner(System.in);
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            double c = scanner.nextDouble();
            // Calculate discriminant
            double delta = b * b - 4 * a * c;
            // roots
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        }
}
