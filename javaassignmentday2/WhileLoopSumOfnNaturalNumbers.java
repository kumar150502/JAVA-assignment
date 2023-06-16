package javaassignmentday2;
import java.util.Scanner;
public class WhileLoopSumOfnNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of natural numbers: ");
        int n = scanner.nextInt();

        int sum = 0;
        int i = 1;
        while (i <= n) {
            sum = sum + i;
            i++;
        }
        System.out.println("The sum of the first " + n + " natural numbers is " + sum);
    }
}
