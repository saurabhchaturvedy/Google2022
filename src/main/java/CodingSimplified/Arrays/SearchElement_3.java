package main.java.CodingSimplified.Arrays;

public class SearchElement_3 {


    private static boolean search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return true;
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = {5, 8, 11, 2, 33, 41};

        System.out.println(search(arr, 8));
    }
}
