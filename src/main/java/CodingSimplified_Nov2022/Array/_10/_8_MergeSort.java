package main.java.CodingSimplified_Nov2022.Array._10;

import java.util.Arrays;

public class _8_MergeSort {


    public static void mergesort(int[] arr, int l, int r) {
        if (l >= r) return;

        int mid = l + (r - l) / 2;
        mergesort(arr, l, mid);
        mergesort(arr, mid + 1, r);
        merge(arr, l, mid, r);
    }

    private static void merge(int[] arr, int l, int mid, int r) {

        int[] X = new int[mid - l + 1];
        int[] Y = new int[r - mid];

        for (int i = 0; i < X.length; i++) {
            X[i] = arr[l + i];
        }

        for (int j = 0; j < Y.length; j++) {
            Y[j] = arr[mid + 1 + j];
        }


        int i = 0;
        int j = 0;
        int k = l;

        while (i < X.length && j < Y.length) {
            if (X[i] <= Y[j]) {
                arr[k] = X[i];
                i++;
            } else {
                arr[k] = Y[j];
                j++;
            }

            k++;
        }

        while (i < X.length) {
            arr[k] = X[i];
            i++;
            k++;
        }

        while (j < Y.length) {

            arr[k] = Y[j];
            j++;
            k++;
        }


    }

    public static void main(String[] args) {

        int[] arr = {8, 2, 11, 7, 19, 13, 5};
        mergesort(arr, 0, arr.length - 1);
        Arrays.stream(arr).boxed().map(x -> x + " ").forEach(System.out::print);
    }
}
