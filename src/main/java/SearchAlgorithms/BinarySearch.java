package main.java.SearchAlgorithms;

public class BinarySearch {


    private static boolean search(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

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

        System.out.println("element found : "+search(new int[]{6,8,10,12,14,16},61));
    }
}
