package main.java.Random_Good_Problems.RandomGoodProblems_2;

import java.util.Arrays;

public class _13_NextPermutation {

    public void nextPermutation(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }

        int i = arr.length - 2;

        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }

        if (i >= 0) {
            int j = arr.length - 1;
            while (arr[j] <= arr[i]) {
                j--;
            }
            swap(arr, i, j);
        }

        reverse(arr, i + 1, arr.length - 1);
    }

    private void reverse(int[] arr, int i, int j) {

        while (i < j) {
            swap(arr, i++, j--);
        }
    }

    private void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 4, 2};
        _13_NextPermutation nextPermutation = new _13_NextPermutation();
        nextPermutation.nextPermutation(arr);
        Arrays.stream(arr).boxed().map(x -> x + " ").forEach(System.out::print);
    }
}
