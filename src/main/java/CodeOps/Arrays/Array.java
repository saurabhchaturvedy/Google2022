package main.java.CodeOps.Arrays;

public class Array {

    public static void main(String[] args) {
        int[] arr = new int[5];

        int[] brr;

        brr = new int[8];

        arr[0] = 45;
        arr[1] = 89;
        arr[2] = 63;
        arr[3] = 59;
        arr[4] = 33;

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        System.out.println(arr[5]);  // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    }
}
