package main.java.CodingSimplified_Nov2022.Array._20;

import java.util.Arrays;

public class _15_SeparateEvenOdd {


    public static void separateOddEven(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            while (arr[start] % 2 == 0 && start < end) {
                start++;
            }

            while (arr[end] % 2 != 0 && start < end) {
                end--;
            }

            if (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        separateOddEven(arr);
        Arrays.stream(arr).boxed().map(x -> x + " ").forEach(System.out::print);
    }
}
