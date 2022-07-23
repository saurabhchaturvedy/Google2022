package main.java.Array;

public class FindMaximum {


    private static int max(int[] arr) {

        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }


    public static void main(String[] args) {

        System.out.println("maximum value in array is : " + max(new int[]{3, 8, 1, 7, -5, 14, 9}));
    }
}
