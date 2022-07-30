package main.java.CodingSimplified.Arrays;

public class BinarySearch_4 {


    private static boolean search(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) >> 1;

            if (arr[mid] == target) return true;

            if (arr[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return false;
    }


    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 8, 10, 12, 14};

        System.out.println("Binary search result : " + search(arr, 122));
    }
}
