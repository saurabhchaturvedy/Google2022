package main.java.CodingSimplified_Nov2022.Array._30;

import java.util.Arrays;

public class _23_ReverseArray {


    public static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        reverse(arr);
        Arrays.stream(arr).boxed().map(x -> x + " ").forEach(System.out::print);
    }
}
