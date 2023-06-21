package javaassignmentday6;
import java.util.Random;
import java.util.Set;
public class CouponNumbers {
    private static final Random random = new Random();

    public static int processDistinctCoupons(int n) {
        Set<Integer> distinctCoupons = new HashSet<>();
        int count = 0;
        while (distinctCoupons.size() < n) {
            int randomNumber = random.nextInt(n);
            if (!distinctCoupons.contains(randomNumber)) {
                distinctCoupons.add(randomNumber);
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 10;
        int count = processDistinctCoupons(n);
        System.out.println("The number of random numbers needed is: " + count);
    }
}
