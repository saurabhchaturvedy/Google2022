package main.java.CodingSimplified_Nov2022.Array._20;

public class _14_ElementGreaterThanRight {


    public static void greaterThanRight(int[] arr) {
        int max = Integer.MIN_VALUE;

        for (int i : arr) {
            if (i > max) {
                max = i;
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {

        int arr[] = {14, 15, 8, 9, 5, 2};
        greaterThanRight(arr);
    }
}
