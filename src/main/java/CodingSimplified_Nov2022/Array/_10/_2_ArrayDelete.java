package main.java.CodingSimplified_Nov2022.Array._10;

import java.util.Arrays;

public class _2_ArrayDelete {

    static int count = 5;

    private static void deleteEnd(int[] arr) {
        if (arr.length == 0) return;

        count--;
    }


    private static void deleteValue(int[] arr, int val) {
        int i = 0;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == val) {
                break;
            }
        }


        if (i == count) {
            System.out.println("Element not found :: ");
            return;
        }

        for (int j = i; j < count - 1; j++) {
            arr[j] = arr[j + 1];
        }

        count--;
    }


    public static void deleteFromPosition(int[] arr, int position) {
        if (position < 0 || position > count) {
            System.out.println("position not found in array :: ");
            return;
        }

        for (int i = position - 1; i < count - 1; i++) {
            arr[i] = arr[i + 1];
        }

        count--;
    }


    private static void print(int[] arr) {

        for (int i = 0; i < count; i++) {
            System.out.print(arr[i] + " ");
        }
    }


    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        deleteEnd(arr);

        print(arr);

        deleteValue(arr, 3);
        System.out.println();
        print(arr);

        deleteFromPosition(arr, 2);
        System.out.println();
        print(arr);
    }
}
