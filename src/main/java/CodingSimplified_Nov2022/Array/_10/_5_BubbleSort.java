package main.java.CodingSimplified_Nov2022.Array._10;

import java.util.Arrays;

public class _5_BubbleSort {


    private static int[] bubbleSort(int[] arr) {


        for (int i = 0; i < arr.length - 1; i++) {
            boolean isSwapped = false;

            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwapped = true;
                }


            }

            if (!isSwapped) break;
        }

        return arr;
    }


    public static void main(String[] args) {

        int[] arr = {7, 3, 5, 11, 19, 15};

        bubbleSort(arr);

        Arrays.stream(arr).boxed().map(x -> x + " ").forEach(System.out::print);
    }
}
