package main.java.CodingSimplified_Nov2022.Array._10;

public class _4_BinarySearch {


    public static int search(int[] arr, int val) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == val) {
                return mid;
            }
            if (arr[mid] > val) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }

        return -1;
    }


    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 8, 10, 12};

        System.out.println(search(arr, 8));
    }
}
