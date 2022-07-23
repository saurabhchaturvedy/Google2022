package main.java.Array;

public class ResizeArray {


    private static int[] resize(int[] arr, int capacity) {

        int[] temp = new int[capacity];

        for (int i = 0; i < arr.length; i++) {

            temp[i] = arr[i];
        }

        arr = temp;
        return arr;
    }


    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        int[] resize = resize(arr, 10);

        System.out.println("Array size after re-sizing : " + resize.length);
    }
}
