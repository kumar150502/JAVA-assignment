package javaassignmentday2;
import java.util.Scanner;
public class Operator4Distance {
    public static void main(String[] args) {
        // Get the x and y coordinates from the command line
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        // Calculate the distance from the origin
        double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

        // Print the distance
        System.out.println("The distance from (x, y) to the origin is " + distance);
    }
}
