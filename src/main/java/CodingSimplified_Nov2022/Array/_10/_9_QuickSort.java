package main.java.CodingSimplified_Nov2022.Array._10;

import java.util.Arrays;

public class _9_QuickSort {


    public static void quicksort(int[] arr, int l, int r) {
        if (l < r) {
            int partitionIndex = partition(arr, l, r);
            quicksort(arr, l, partitionIndex - 1);
            quicksort(arr, partitionIndex + 1, r);
        }
    }

    private static int partition(int[] arr, int l, int r) {

        int pivot = arr[r];
        int index = l - 1;

        for (int j = l; j < r; j++) {
            if (arr[j] < pivot) {
                index++;
                swap(arr, index, j);
            }
        }

        swap(arr, index + 1, r);
        return index + 1;
    }

    private static void swap(int[] arr, int index, int j) {

        int temp = arr[index];
        arr[index] = arr[j];
        arr[j] = temp;
    }


    public static void main(String[] args) {

        int[] arr = {9, 1, 13, 7, 18, 27, 15, 8};
        quicksort(arr, 0, arr.length - 1);

        Arrays.stream(arr).boxed().map(x -> x + " ").forEach(System.out::print);
    }
}
