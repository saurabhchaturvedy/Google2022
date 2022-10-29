package main.java.CodingSimplified_Nov2022.Array._10;

import java.util.Arrays;

public class _7_SelectionSort {


    public static int[] selectionSort(int[] arr) {
        int minIndex = 0;
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {

            minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }

        return arr;
    }

    public static void main(String[] args) {


        int[] arr = {7, 1, 5, 18, 13, 8};

        selectionSort(arr);

        Arrays.stream(arr).boxed().map(x -> x + " ").forEach(System.out::print);
    }
}
