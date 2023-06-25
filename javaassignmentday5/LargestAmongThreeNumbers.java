package javaassignmentday5;
import java.util.Scanner;
public class LargestAmongThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int number3 = scanner.nextInt();
        int largestNumber = number1;
        if (number2 > largestNumber) {
            largestNumber = number2;
        }
        if (number3 > largestNumber) {
            largestNumber = number3;
        }

        System.out.println("The largest number is: " + largestNumber);
    }
}
