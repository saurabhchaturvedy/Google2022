package main.java.Random_Good_Problems;

import java.util.Arrays;

public class MergeSortedArrays_20 {


    static int[] mergeSortedArrays(int[] first, int[] second) {
        int i = 0;
        int j = 0;
        int k = 0;

        int[] mergedArray = new int[first.length + second.length];

        while (i < first.length && j < second.length) {
            if (first[i] < second[i]) {
                mergedArray[k] = first[i];
                i++;
            }

            if (second[j] < first[i]) {
                mergedArray[k] = second[j];
                j++;
            }

            k++;
        }

        while (i< first.length) {
            mergedArray[k] = first[i];
            i++;
            k++;
        }

        while (j < second.length) {
            mergedArray[k] = second[j];
            j++;
            k++;
        }

        return mergedArray;
    }

    public static void main(String[] args) {

        int[] first = {2, 4, 6, 8, 10};
        int[] second = {1, 3, 5, 7, 9};
        Arrays.stream(mergeSortedArrays(first, second)).forEach(System.out::println);
        System.out.println("here");
    }
}
