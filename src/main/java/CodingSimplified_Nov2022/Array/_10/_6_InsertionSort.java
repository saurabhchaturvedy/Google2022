package main.java.CodingSimplified_Nov2022.Array._10;

import java.util.Arrays;

public class _6_InsertionSort {


    public static int[] insertionSort(int[] arr) {
        int temp = 0;
        int j = 0;

        for (int i = 1; i < arr.length; i++) {
            temp = arr[i];
            j = i - 1;

            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }

            arr[j + 1] = temp;
        }

        return arr;
    }

    public static void main(String[] args) {


        int[] arr = {8, 3, 19, 7, 22, 9, 11};

        insertionSort(arr);

        Arrays.stream(arr).boxed().map(x -> x + " ").forEach(System.out::print);
    }
}
