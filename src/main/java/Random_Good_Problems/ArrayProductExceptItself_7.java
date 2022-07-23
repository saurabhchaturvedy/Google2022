package main.java.Random_Good_Problems;

import java.util.Arrays;

public class ArrayProductExceptItself_7 {


    private static int[] findProduct(int[] arr) {
        int temp = 1;
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = temp;
            temp = temp * arr[i];
        }

        temp = 1;

        for (int i = arr.length - 1; i >= 0; i--) {

            result[i] = temp * result[i];
            temp = temp * arr[i];
        }

        return result;
    }

    public static void main(String[] args) {

        Arrays.stream(findProduct(new int[]{1, 2, 3, 4,})).forEach(System.out::println);
    }
}
