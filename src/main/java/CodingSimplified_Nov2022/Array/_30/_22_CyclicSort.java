package main.java.CodingSimplified_Nov2022.Array._30;

import java.util.Arrays;

public class _22_CyclicSort {


    public static void cyclicSort(int[] arr) {

        int i = 0;

        while (i < arr.length) {
            if (arr[i] != i + 1) {
                int destinationIndex = arr[i] - 1;

                int temp = arr[i];
                arr[i] = arr[destinationIndex];
                arr[destinationIndex] = temp;
            } else {
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 6, 2, 1, 5};
        cyclicSort(arr);
        Arrays.stream(arr).boxed().map(x -> x + " ").forEach(System.out::print);
    }
}
