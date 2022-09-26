package main.java.Random_Good_Problems;

public class SpiralMatrix_12 {


    private static void printSpiral(int[][] matrix) {

        int rowStart = 0;
        int rowEnd = matrix.length - 1;
        int columnStart = 0;
        int columnEnd = matrix[0].length - 1;

        while (rowStart < rowEnd && columnStart < columnEnd) {
            for (int i = columnStart; i <= columnEnd; i++) {
                System.out.print(matrix[rowStart][i] + " ");
            }
            rowStart = rowStart + 1;
            System.out.println();

            for (int i = rowStart; i <= rowEnd; i++) {
                System.out.print(matrix[i][columnEnd] + " ");
            }
            System.out.println();
            columnEnd = columnEnd - 1;
            if (rowStart < rowEnd) {
                for (int i = columnEnd; i >= columnStart; i--) {
                    System.out.print(matrix[rowEnd][i] + " ");
                }
                rowEnd = rowEnd - 1;
            }
            System.out.println();
            if (columnStart < columnEnd) {
                for (int i = rowEnd; i >= rowStart; i--) {
                    System.out.print(matrix[i][columnStart] + " ");
                }
                columnStart = columnStart + 1;
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        printSpiral(matrix);
    }
}

// 1 2 3 4
// 5 6 7 8
// 9 10 11 12
// 13 14 15 16