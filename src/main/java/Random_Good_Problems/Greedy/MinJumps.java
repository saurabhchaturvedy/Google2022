package main.java.Random_Good_Problems.Greedy;

class MinJumps {
    public static int jump(int[] A) {
        int jumps = 0, curEnd = 0, curFarthest = 0;
        for (int i = 0; i < A.length - 1; i++) {
            System.out.println("farthest candidate " + (i + A[i]));
            curFarthest = Math.max(curFarthest, i + A[i]);
            if (i == curEnd) {
                jumps++;
                curEnd = curFarthest;
            }
        }
        return jumps;
    }

    public static void main(String[] args) {

        System.out.println(jump(new int[]{2, 3, 1, 1, 4}));
    }
}