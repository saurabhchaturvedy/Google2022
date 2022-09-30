package main.java.Random_Good_Problems.MiniMax;

import java.util.HashMap;
import java.util.Map;

class CanIWin {
    public static boolean canIWin(int maxChoosableInteger, int desiredTotal) {
        int sum = maxChoosableInteger * (maxChoosableInteger + 1) / 2;
        if (sum < desiredTotal) {
            return false;
        }
        if (desiredTotal <= maxChoosableInteger) {
            return true;
        }
        Map<Integer, Boolean> memo = new HashMap<Integer, Boolean>();
        boolean[] used = new boolean[maxChoosableInteger + 1];
        return helper(desiredTotal, memo, used);
    }

    private static boolean helper(int desiredTotal, Map<Integer, Boolean> memo, boolean[] used) {
        if (desiredTotal <= 0) {
            return false;
        }
        int key = formatKey(used);
        if (!memo.containsKey(key)) {

            // try every unchosen number as next step
            for (int i = 1; i < used.length; i++) {
                if (!used[i]) {
                    used[i] = true;

                    // check whether this lead to a win (i.e. the other player lose)
                    if (!helper(desiredTotal - i, memo, used)) {
                        memo.put(key, true);
                        used[i] = false;
                        return true;
                    }
                    used[i] = false;
                }
            }
            memo.put(key, false);
        }
        return memo.get(key);

    }

    private static int formatKey(boolean[] used) {
        int key = 0;
        for (boolean b : used) {
            key = key << 1;
            if (b) {
                key = key | 1;
            }
        }
        return key;
    }

    public static void main(String[] args) {

        System.out.println(canIWin(10,11));
    }
}