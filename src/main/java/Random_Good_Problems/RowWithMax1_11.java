package main.java.Random_Good_Problems;

public class RowWithMax1_11 {


    private static int maxOnes(int[][] arr) {

        if (arr == null || arr.length == 0) return -1;

        int row = -1;

        int i = 0;
        int j = arr[0].length - 1;

        while (i <= arr.length - 1 && j >= 0) {

            if (arr[i][j] == 1) {
                j--;
                row = i;
            } else {
                i++;
            }
        }

        return row + 1;
    }


    public static void main(String[] args) {
        int[][] arr = {{0, 0, 0, 1, 1}, {0, 0, 1, 1, 1}, {0, 1, 1, 1, 1}, {1, 1, 1, 1, 1}};

        System.out.println("row with max ones : " + maxOnes(arr));
    }
}
