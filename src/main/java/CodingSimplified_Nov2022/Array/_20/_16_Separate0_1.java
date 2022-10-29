package main.java.CodingSimplified_Nov2022.Array._20;

import java.util.Arrays;

public class _16_Separate0_1 {


    public static void separate0_1(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            while (arr[start] == 0 && start < end) {
                start++;
            }

            while (arr[end] == 1 && start < end) {
                end--;
            }

            if (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;

                start++;
                end--;
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1};
        separate0_1(arr);
        Arrays.stream(arr).boxed().map(x -> x + " ").forEach(System.out::print);
    }
}
