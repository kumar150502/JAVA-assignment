package javaassignmentday3;
import java.util.Arrays;
import java.util.HashMap;
public class FrequencyOfEachElement2 {
    public static void main(String[] args) {
        // Initialize the array
        int[] arr = {1, 2, 3, 2, 1, 5};
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int element : arr) {
            if (!frequencyMap.containsKey(element)) {
                frequencyMap.put(element, 1);
            } else {
                frequencyMap.put(element, frequencyMap.get(element) + 1);
            }
        }
        for (int key : frequencyMap.keySet()) {
            System.out.println(key + " : " + frequencyMap.get(key));
        }
    }
}
