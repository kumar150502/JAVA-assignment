package javaassignmentday5;
import java.util.*;
public class Factors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        List<Integer> factors = new ArrayList<>();
        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                factors.add(i);
                n = n / i;
            }
        }

        if (n > 1) {
            factors.add(n);
        }

        System.out.println("The prime factors of " + n + " are: " + factors);
    }
}
