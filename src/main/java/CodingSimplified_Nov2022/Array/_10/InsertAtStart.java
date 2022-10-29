package main.java.CodingSimplified_Nov2022.Array._10;

import java.util.Arrays;

public class InsertAtStart {


    private static int[] insertAtStart(int[] arr, int val) {

        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = val;

        return arr;
    }


    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        Arrays.stream(insertAtStart(arr, 14)).forEach(System.out::println);
    }
}
