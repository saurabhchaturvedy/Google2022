package main.java.CodingSimplified_Nov2022.Array._20;

import java.util.Arrays;

public class _12_Sort012 {


    public static int[] sort012(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                swap(arr, low, mid);
                low++;
                mid++;
            } else if (arr[mid] == 1) {

                mid++;

            } else {
                swap(arr, mid, high);
                high--;
            }
        }

        return arr;
    }

    private static void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {

        int[] arr = {0, 2, 1, 2, 1, 0, 2, 0, 0, 1, 1, 2, 1};
        sort012(arr);
        Arrays.stream(arr).boxed().map(x -> x + " ").forEach(System.out::print);
    }
}
