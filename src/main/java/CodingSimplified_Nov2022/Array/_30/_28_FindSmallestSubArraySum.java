package main.java.CodingSimplified_Nov2022.Array._30;

import java.util.HashMap;
import java.util.Map;

public class _28_FindSmallestSubArraySum {


    public int smallestSubArrayEqualToSum(int[] arr, int sum) {
        if (arr.length == 0) {
            return -1;
        }

        int start = 0;
        int end = 0;
        int current_sum = 0;
        int window_sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        int min_length = Integer.MAX_VALUE;


        while (end < arr.length) {
            current_sum = current_sum + arr[end];
            if (current_sum == sum) {
                min_length = Math.min(min_length, end - start + 1);

            }
            window_sum = current_sum - sum;

            if (map.containsKey(window_sum)) {
                start = map.get(window_sum);
                min_length = Math.min(min_length, end - start);

            }

            map.put(current_sum, end++);
        }

        return min_length;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 5, 3, 1, 8};
        _28_FindSmallestSubArraySum findSmallestSubArraySum = new _28_FindSmallestSubArraySum();
        int smallest_length = findSmallestSubArraySum.smallestSubArrayEqualToSum(arr, 9);
        System.out.println(" smallest length : " + smallest_length);
    }
}
