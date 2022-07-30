package main.java.CodingSimplified.Arrays;

public class DeleteElement_2 {

    int count = 5;

    void deleteFromEnd(int[] arr) {
        if (arr.length == 0) return;
        count--;
    }

    void deleteAnItem(int[] arr, int target) {
        int i = 0;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == target) break;
        }

        if (i == count) {
            throw new RuntimeException("no such element");
        }

        for (int j = i; i < count - 1; i++) {
            arr[j] = arr[j + 1];
        }

        count--;
    }

    void deleteFromPosition(int[] arr, int position) {
        if (position >= count || position <= 0) throw new RuntimeException("Invalid position");

        for (int i = position - 1; i < count - 1; i++) {
            arr[i] = arr[i + 1];
        }

        count--;
    }

    public static void main(String[] args) {


        int[] arr = {2, 9, 3, 16, 13};
    }
}
