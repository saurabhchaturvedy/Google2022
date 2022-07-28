package main.java.SearchAlgorithms;

public class LinearSearch {


    private static boolean search(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) return true;
        }

        return false;
    }


    public static void main(String[] args) {

        System.out.println("Element is found : " + search(new int[]{3, 1, 7, 4, 9, 5}, 17));
    }
}
