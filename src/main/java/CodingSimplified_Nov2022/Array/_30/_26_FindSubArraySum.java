package main.java.CodingSimplified_Nov2022.Array._30;

import java.util.HashMap;
import java.util.Map;

public class _26_FindSubArraySum {


    public void subArraySumEqualToSum(int[] arr, int sum) {
        if (arr.length == 0) {
            return;
        }

        int start = 0;
        int end = 0;
        int current_sum = 0;
        int window_sum = 0;
        Map<Integer, Integer> map = new HashMap<>();

        while (end < arr.length) {
            current_sum = current_sum + arr[end];
            if (current_sum == sum) {
                System.out.println(" start : " + start + " end : " + end);
                return;
            }
            window_sum = current_sum - sum;

            if (map.containsKey(window_sum)) {
                start = map.get(window_sum);
                System.out.println(" start : " + (start + 1) + " end : " + end);
                return;
            }

            map.put(current_sum, end++);
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 5, 3, 1, 8};
        _26_FindSubArraySum findSubArraySum = new _26_FindSubArraySum();
        findSubArraySum.subArraySumEqualToSum(arr, 9);
    }
}
