package main.java.Random_Good_Problems;

import java.util.HashMap;
import java.util.Map;

public class TwoSum_1 {


    private static int[] twoSum(int[] num, int target) {
        int[] indexes = new int[2];

        Map<Integer, Integer> numberIndexMap = new HashMap<>();

        for (int i = 0; i < num.length; i++) {
            if (!numberIndexMap.containsKey(target - num[i])) {
                numberIndexMap.put(num[i], i);
            } else {
                indexes[1] = i;
                indexes[0] = numberIndexMap.get(target - num[i]);
            }
        }

        return indexes;
    }


    public static void main(String[] args) {
        int[] numbers = {2, 11, 5, 10, 7, 8};

        int[] ints = twoSum(numbers, 9);

        System.out.println("Two sum indexes are : " + ints[0] + " " + ints[1]);
    }
}
