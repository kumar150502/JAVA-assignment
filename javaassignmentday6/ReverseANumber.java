package javaassignmentday6;
import java.util.Scanner;
public class ReverseANumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int reverse = 0;
        for (int i = number; i > 0; i /= 10) {
            int remainder = i % 10;
            reverse = reverse * 10 + remainder;
        }

        System.out.println("The reversed number is: " + reverse);
    }
}
