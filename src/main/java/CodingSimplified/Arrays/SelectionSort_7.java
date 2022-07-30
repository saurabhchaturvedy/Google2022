package main.java.CodingSimplified.Arrays;

import java.util.Arrays;

public class SelectionSort_7 {


    static int[] selectionSort(int[] arr) {
        int minIndex = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }

        return arr;
    }


    public static void main(String[] args) {

        int[] arr = {5, 7, 1, 15, 11, 8};

        Arrays.stream(selectionSort(arr)).forEach(System.out::println);
    }
}
