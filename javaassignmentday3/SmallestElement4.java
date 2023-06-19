package javaassignmentday3;

public class SmallestElement4 {
    public static void main(String[] args) {
        int[] array = {10, 5, 20, 25, 15};
        int smallest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        System.out.println("The smallest element in the array is: " + smallest);
    }
}
