package main.java.CodingSimplified_Nov2022.Array._10;

import java.util.Arrays;

public class _10_LargestContiguosSubArray {


    public static int contiguousSum(int[] arr) {
        int max_sum_all = arr[0];
        int curr_max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            curr_max = Math.max(curr_max, curr_max + arr[i]);
            max_sum_all = Math.max(max_sum_all, curr_max);
        }

        return max_sum_all;
    }

    public static void main(String[] args) {
        int arr[] = {-3, -4, 4, -1, -2, 1, 5, -3};
        System.out.println(contiguousSum(arr));

    }
}
