package main.java.Array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {


    private static int[] twoSum(int[] arr, int target) {
        int[] result = new int[2];

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            if (!map.containsKey(target - arr[i])) {
                map.put(arr[i], i);
            } else {

                result[0] = map.get(target - arr[i]);
                result[1] = i;
            }
        }

        return result;
    }


    public static void main(String[] args) {


        System.out.println("Two sum indexes are : " + twoSum(new int[]{2, 8, 6, 3, 9}, 5)[0] + " " + twoSum(new int[]{2, 8, 6, 3, 9}, 5)[1]);
    }
}
