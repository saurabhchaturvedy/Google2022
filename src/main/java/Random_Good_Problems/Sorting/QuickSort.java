package main.java.Random_Good_Problems.Sorting;

import java.util.Arrays;

public class QuickSort {


    public void quickSort(int[] arr, int l, int r) {
        if (l < r) {
            int pivotIndex = partition(arr, l, r);
            quickSort(arr, l, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, r);
        }
    }

    private int partition(int[] arr, int l, int r) {

        int pivot = arr[r];
        int i = l - 1;

        for (int j = l; j < r; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, r);
        return i + 1;
    }

    public int KthLargest(int[] arr, int l, int r, int k) {

        int pivotIndex = partition(arr, l, r);
        if (pivotIndex == k - 1) return arr[pivotIndex];
        if (pivotIndex > k - 1) return KthLargest(arr, l, r - 1, k);
        if (pivotIndex < k - 1) return KthLargest(arr, l + 1, r, k);
        return -1;

    }

    private void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static void main(String[] args) {
        int[] arr = {8, 3, 11, 2, 19, 15, 33, 13};
        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(arr, 0, arr.length - 1);
        Arrays.stream(arr).forEach(System.out::println);
        System.out.println();
        System.out.println(quickSort.KthLargest(arr, 0, arr.length - 1, 3));
    }
}
