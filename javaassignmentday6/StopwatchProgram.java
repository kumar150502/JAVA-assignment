package javaassignmentday6;
import java.util.Scanner;
public class StopwatchProgram {

    private long startTime;
    private long endTime;

    public Stopwatch() {
        startTime = 0;
        endTime = 0;
    }

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return endTime - startTime;
    }

    public static void main(String[] args) {
        Stopwatch stopwatch = new Stopwatch();

        System.out.println("Press Enter to start the stopwatch");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        stopwatch.start();

        System.out.println("Press Enter to stop the stopwatch");
        scanner.nextLine();

        stopwatch.stop();

        long elapsedTime = stopwatch.getElapsedTime();
        System.out.println("The elapsed time is: " + elapsedTime + " milliseconds");
    }
}
