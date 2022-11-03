package main.java.CodingSimplified_Nov2022.Array._30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _25_FindCorruptPair {


    public static List<Integer> findCorruptPair(int[] arr) {

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
                return Arrays.asList(j + 1, arr[j]);
            }
        }

        return new ArrayList<>();
    }


    public static void main(String[] args) {

    }
}
