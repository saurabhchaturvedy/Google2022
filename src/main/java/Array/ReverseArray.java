package main.java.Array;

import java.util.Arrays;

public class ReverseArray {


    private static int[] reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        int temp = 0;

        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;

        }

        return arr;
    }

    public static void main(String[] args) {

        Arrays.stream(reverse(new int[]{2, 3, 5})).forEach(System.out::println);
    }
}
