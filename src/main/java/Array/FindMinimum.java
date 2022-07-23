package main.java.Array;

public class FindMinimum {


    private static int min(int[] arr) {

        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }

    public static void main(String[] args) {

        System.out.println("minimum value in array is : " + min(new int[]{3, 8, 1, 7, -5, 14, 9}));
    }
}
