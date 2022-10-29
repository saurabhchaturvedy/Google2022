package main.java.CodingSimplified_Nov2022.Array._20;

public class _11_FindMissingNumber {


    public static int missingNumber(int[] arr, int n) {
        int sum = (n * (n + 1)) / 2;
        int arrSum = 0;
        for (int i = 0; i < arr.length; i++) {
            arrSum = arrSum + arr[i];
        }
        return sum - arrSum;

    }


    public static void main(String[] args) {
        int[] arr = {3, 4, 2, 1, 5, 8, 9, 10};

        System.out.println(missingNumber(arr, 10));
    }
}
