package javaassignmentday5;
import java.util.Scanner;
public class PowerOf2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a power of 2: ");
        int n = scanner.nextInt();

        System.out.println("The powers of 2 that are less than or equal to 2^" + n + " are:");

        for (int i = 0; i <= n; i++) {
            System.out.println(2 << i);
        }
    }
}
