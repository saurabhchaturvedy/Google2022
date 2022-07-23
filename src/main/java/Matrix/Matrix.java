package main.java.Matrix;

public class Matrix {


    private static boolean search(int[][] arr, int target) {
        if (arr == null || arr.length == 0) return false;

        int i = 0;
        int j = arr.length - 1;

        while (i < arr.length && j >= 0) {

            if (arr[i][j] == target) return true;

            if (arr[i][j] > target) {
                j--;
            } else {

                i++;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[][] arr = {{2, 6, 4}, {17, 8, 11}, {3, 0, 9}};

        System.out.println(" result of search is : " + search(arr, 88));
    }
}
