package main.java.CodingSimplified_Nov2022.Array._10;

public class _3_ArraySearch {


    public static int search(int[] arr, int val) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val) {
                return i;
            }
        }

        return -1;
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("searched element index :: " + search(arr, 4));
    }
}
