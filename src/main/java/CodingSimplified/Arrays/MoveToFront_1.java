package main.java.CodingSimplified.Arrays;

import java.util.Arrays;

public class MoveToFront_1 {


    static int[] moveToFront(int[] arr, int target) {
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = target;

        return arr;
    }

    static int[] moveToEnd(int[] arr, int target) {
        arr[arr.length - 1] = target;

        return arr;
    }


    static int[] insertToPosition(int[] arr, int target, int position) {
        for (int i = arr.length - 1; i > position - 1; i--) {
            arr[i] = arr[i - 1];
        }

        arr[position - 1] = target;
        return arr;
    }


    public static void main(String[] args) {
        int[] arr = {34, 67, 89, 77};

        Arrays.stream(moveToFront(arr, 13)).forEach(System.out::println);
        System.out.println();
        Arrays.stream(moveToEnd(arr, 13)).forEach(System.out::println);
        System.out.println();
        Arrays.stream(insertToPosition(arr, 13, 3)).forEach(System.out::println);
    }
}
