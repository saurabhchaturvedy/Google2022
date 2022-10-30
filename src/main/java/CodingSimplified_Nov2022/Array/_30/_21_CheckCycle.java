package main.java.CodingSimplified_Nov2022.Array._30;

public class _21_CheckCycle {


    public static boolean hasCycle(int[] arr) {
        int slow = 0;
        int fast = 0;
        for (int i = 0; i < arr.length; i++) {
            slow = fast = i;
            boolean isForward = arr[i] >= 0;

            while (true) {
                slow = getNextPosition(arr, slow, isForward);
                if (slow == -1) {
                    break;
                }
                fast = getNextPosition(arr, fast, isForward);
                if (fast == -1) {
                    break;
                }
                fast = getNextPosition(arr, fast, isForward);
                if (fast == -1) {
                    break;
                }

                if (slow == fast) {
                    return true;
                }

            }
        }

        return false;
    }

    private static int getNextPosition(int[] arr, int index, boolean isForward) {

        boolean direction = arr[index] >= 0;

        if (direction != isForward) {
            return -1;
        }

        int nextIndex = (index + arr[index]) % arr.length;

        if (nextIndex < 0) {
            nextIndex = nextIndex + arr.length;
        }

        if (nextIndex == index) {
            return -1;
        }

        return nextIndex;
    }


    public static void main(String[] args) {
        int[] arr = {2, -1, 1, 2, 2};
        int[] arr2 = {1, 2};
        System.out.println(hasCycle(arr));

        System.out.println(hasCycle(arr2));
    }
}
