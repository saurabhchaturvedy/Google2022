package main.java.CodingSimplified.Arrays;

import java.util.Arrays;

public class InsertionSort_6 {


    static int[] insertionSort(int[] arr) {
        int key = 0;
        int j = 0;

        for (int i = 1; i < arr.length; i++) {
            key = arr[i];

            for (j = i - 1; j >= 0 && arr[j] > key; j--) {
                arr[j + 1] = arr[j];
            }

            arr[j + 1] = key;
        }

        return arr;
    }


    public static void main(String[] args) {

        int[] arr = {7, 11, 3, 28, 19, 37, 15};
        Arrays.stream(insertionSort(arr)).forEach(System.out::println);
    }
}
