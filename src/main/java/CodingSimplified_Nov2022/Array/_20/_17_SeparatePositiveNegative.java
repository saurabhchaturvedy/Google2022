package main.java.CodingSimplified_Nov2022.Array._20;

import java.util.Arrays;

public class _17_SeparatePositiveNegative {


    public static void separatePositiveNegative(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            while (arr[start] < 0 && start < end) {
                start++;
            }

            while (arr[end] > 0 && start < end) {
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

        int[] arr = {-5, 2, 5, 7, -8, -4, 16, -9, 24};
        separatePositiveNegative(arr);
        Arrays.stream(arr).boxed().map(x -> x + " ").forEach(System.out::print);
    }
}
