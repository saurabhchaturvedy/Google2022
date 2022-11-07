package main.java.Random_Good_Problems.RandomGoodProblems_2;

import main.java.Random_Good_Problems.SpiralMatrix_12;

public class _12_SpiralMatrix {


    public static void printSpiral(int[][] arr) {
        int top = 0;
        int bottom = arr.length - 1;
        int left = 0;
        int right = arr[0].length - 1;

        while (left <= right && top <= bottom) {
            for (int i = left; i <= right; i++) {
                System.out.print(arr[top][i] + " ");
            }
            top++;
            System.out.println();
            for (int i = top; i <= bottom; i++) {
                System.out.print(arr[i][right] + " ");
            }

            right--;
            System.out.println();
            if (left <= right) {
                for (int i = right; i >= left; i--) {
                    System.out.print(arr[bottom][i] + " ");
                }
            }
            bottom--;
            System.out.println();
            if (top <= bottom) {
                for (int i = bottom; i >= top; i--) {
                    System.out.println(arr[i][left] + " ");
                }
            }

            left++;
        }
    }


    public static void main(String[] args) {

        SpiralMatrix_12 spiralMatrix_12 = new SpiralMatrix_12();
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        printSpiral(arr);
    }
}
