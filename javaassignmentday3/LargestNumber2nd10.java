package javaassignmentday3;
public class LargestNumber2nd10 {
    public static int getSecondLargest(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 2];
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 6, 3, 2};
        int secondLargestNumber = getSecondLargest(arr);
        System.out.println("The second largest number in the array is: " + secondLargestNumber);
    }
}
