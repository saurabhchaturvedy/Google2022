package main.java.Array;

import java.util.Arrays;

public class RemoveEvenIntegers {


    private static int[] removeEven(int[] arr) {
        int oddNumbers = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                oddNumbers++;
            }
        }

        int[] result = new int[oddNumbers];

        int index = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 != 0) {
                result[index] = arr[i];
                index++;
            }
        }

        return result;
    }


    public static void main(String[] args) {

        int[] arr = {2, 3, 4, 6, 7, 8, 9, 11, 14};

        Arrays.stream(removeEven(arr)).forEach(System.out::println);
    }
}
