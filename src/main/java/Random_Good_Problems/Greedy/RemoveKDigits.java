package main.java.Random_Good_Problems.Greedy;

class RemoveKDigits {

    public static String removeKdigits(String num, int k) {
        String result = helper(num, k);

        // Remove leading 0s
        int i = 0;
        while (i < result.length() - 1) {
            if (result.charAt(i) != '0') break;
            i++;
        }
        result = result.substring(i, result.length());
        if (result.length() == 0) {
            return "0";
        }
        return result;
    }

    public static String helper(String num, int k) {
        if (num == null || k < 0 || num.length() <= k) {
            return "";
        }
        if (k == 0) {
            return num;
        }

        int m = num.length();
        String candidate = num.substring(0, k + 1);
        int minDigit = Integer.MAX_VALUE;
        int index = 0;

        for (int i = 0; i < candidate.length(); i++) {
            int digit = candidate.charAt(i) - '0';
            if (digit < minDigit) {
                minDigit = digit;
                index = i;
            }
        }
        return candidate.substring(index, index + 1) + helper(num.substring(index + 1, m), k - index);
    }

    public static void main(String[] args) {
        String str = "10200";
        System.out.println(removeKdigits(str, 1));
    }
}