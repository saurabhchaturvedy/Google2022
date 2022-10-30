package main.java.CodingSimplified_Nov2022.Array._30;

import java.util.Arrays;

public class _24_MissingNumberNNP1 {


    public static void findMissing(int[] arr) {

        int i = 0;

        while (i < arr.length) {
            if (arr[i] <= arr.length && arr[i] != i + 1) {
                int destinationIndex = arr[i] - 1;

                int temp = arr[i];
                arr[i] = arr[destinationIndex];
                arr[destinationIndex] = temp;
            } else {
                i++;
            }
        }


        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                System.out.println("Missing number : " + (j + 1));
            }
        }
    }


    public static void main(String[] args) {

        int[] arr = {3, 2, 4, 6, 1};
        findMissing(arr);
        Arrays.stream(arr).boxed().map(x -> x + " ").forEach(System.out::print);
    }
}
