package javaassignmentday2;
import java.util.Scanner;
public class IfElseReadNumberDisplayUnitTenHundred {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (1, 10, 100, or 1000): ");
        int number = scanner.nextInt();

        if (number == 1) {
            System.out.println("Unit: 1");
        } else if (number == 10) {
            System.out.println("Unit: 0");
            System.out.println("Ten: 1");
        } else if (number == 100) {
            System.out.println("Unit: 0");
            System.out.println("Ten: 0");
            System.out.println("Hundred: 1");
        } else if (number == 1000) {
            System.out.println("Unit: 0");
            System.out.println("Ten: 0");
            System.out.println("Hundred: 0");
            System.out.println("Thousand: 1");
        } else {
            System.out.println("Invalid input! Please enter 1, 10, 100, or 1000.");
        }
    }
}
