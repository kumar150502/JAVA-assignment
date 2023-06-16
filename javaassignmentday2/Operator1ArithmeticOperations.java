package javaassignmentday2;
import java.util.Scanner;
public class Operator1ArithmeticOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double a = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double b = scanner.nextDouble();
        System.out.print("Enter the third number: ");
        double c = scanner.nextDouble();
        double result1 = a + b * c;
        double result2 = c + a / b;
        double result3 = a % b + c;
        double result4 = a * b + c;
        double max = Math.max(Math.max(result1, result2), Math.max(result3, result4));
        double min = Math.min(Math.min(result1, result2), Math.min(result3, result4));
        System.out.println("Result 1 (a + b * c): " + result1);
        System.out.println("Result 2 (c + a / b): " + result2);
        System.out.println("Result 3 (a % b + c): " + result3);
        System.out.println("Result 4 (a * b + c): " + result4);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}
