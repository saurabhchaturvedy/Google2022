package main.java.CodingSimplified_Nov2022.Array._20;

public class _20_FirstOccDiffK {

    public int findWhereAdjacentDifferByAtMostk(int arr[], int k, int val) {
        int start = 0;

        while (start < arr.length) {
            if (arr[start] == val) {
                return start;
            }

            int diff = Math.abs(arr[start] - val) / k;
            diff = Math.max(1, diff);

            start = start + diff;
        }

        return -1;
    }


    public static void main(String[] args) {

        _20_FirstOccDiffK a = new _20_FirstOccDiffK();
        int arr1[] = {70, 60, 70, 80, 90, 110, 130};
        int arr2[] = {2, 3, 2, 4, 5, 6, 7};

        System.out.println(a.findWhereAdjacentDifferByAtMostk(arr1, 20, 110));
        System.out.println(a.findWhereAdjacentDifferByAtMostk(arr2, 1, 2));
    }
}
