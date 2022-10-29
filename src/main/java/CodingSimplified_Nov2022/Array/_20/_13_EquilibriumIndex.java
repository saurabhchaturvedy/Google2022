package main.java.CodingSimplified_Nov2022.Array._20;

public class _13_EquilibriumIndex {


    public static int equilibriumIndex(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int leftSum = 0;
        int rightSum = 0;

        while (start <= end) {
            if (leftSum > rightSum) {
                rightSum = rightSum + arr[end--];
            } else {
                leftSum = leftSum + arr[start++];
            }
        }

        if (leftSum == rightSum) return end;

        return -1;
    }


    public static void main(String[] args) {

        int[] arr = {2, -4, 4, -6, 6, 1, 1};

        System.out.println(equilibriumIndex(arr));
    }
}
