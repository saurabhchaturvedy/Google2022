package main.java.Random_Good_Problems;

import java.util.Arrays;

public class SquaresOfSortedArray_16 {


    private static int[] squareSortedArray(int[] array) {
        int n = array.length;
        int[] result = new int[n];
        int i = 0;
        int j = n - 1;
        for (int k = n - 1; k >= 0; k--) {
            if (Math.abs(array[i]) > Math.abs(array[j])) {
                result[k] = array[i] * array[i];
                i++;
            } else {
                result[k] = array[j] * array[j];
                j--;
            }
        }
        return result;
    }


    public static void main(String[] args) {

        int[] array = {-4, -1, 0, 3, 10};
        Arrays.stream(squareSortedArray(array)).forEach(System.out::println);
    }
}
