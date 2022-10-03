package main.java.Random_Good_Problems.Sorting;

import java.util.Arrays;

public class MergeSort {


    void mergeSort(int[] arr, int l, int r) {
        if (l >= r) return;
        int mid = l + (r - l) / 2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, r);
        merge(arr, l, mid, r);
    }

    int[] merge(int[] arr, int l, int mid, int r) {
        int[] X = new int[mid - l + 1];
        int[] Y = new int[r - mid];

        for (int i = 0; i < X.length; i++) {
            X[i] = arr[l + i];
        }

        for (int j = 0; j < Y.length; j++) {
            Y[j] = arr[mid + 1 + j];
        }

        int x_length = X.length;
        int y_length = Y.length;
        int i = 0;
        int j = 0;
        int k = l;
        while (i < x_length && j < y_length) {

            if (X[i] <= Y[j]) {
                arr[k] = X[i];
                i++;
            } else {
                arr[k] = Y[j];
                j++;
            }
            k++;
        }

        while (i < x_length) {
            arr[k] = X[i];
            i++;
            k++;
        }

        while (j < y_length) {
            arr[k] = Y[j];
            j++;
            k++;
        }

        return arr;
    }


    public static void main(String[] args) {

        int[] arr = {8, 3, 11, 2, 19, 15, 33, 13};

        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(arr, 0, arr.length - 1);

        Arrays.stream(arr).forEach(System.out::println);
    }
}
