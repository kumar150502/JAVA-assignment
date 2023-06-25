package javaassignmentday5;
import java.util.Random;
public class FlipCoinPercentage {
    public static void main(String[] args) {
        int numberFlips = 100;
        int heads = 0;
        int tails = 0;
        Random random = new Random();

        for (int i = 0; i < numberFlips; i++) {
            double randomNumber = random.nextDouble();
            if (randomNumber < 0.5) {
                heads++;
            } else {
                tails++;
            }
        }

        double percentageOfHeads = 100.0 * heads / numberFlips;
        double percentageOfTails = 100.0 * tails / numberFlips;

        System.out.println("Percentage of heads: " + percentageOfHeads);
        System.out.println("Percentage of tails: " + percentageOfTails);
    }
}
