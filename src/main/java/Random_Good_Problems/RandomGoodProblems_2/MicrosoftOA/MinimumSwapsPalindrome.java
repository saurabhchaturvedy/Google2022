package main.java.Random_Good_Problems.RandomGoodProblems_2.MicrosoftOA;

import java.util.Scanner;

public class MinimumSwapsPalindrome {

    public static boolean isValid(String s) {
        int[] counter = new int[26];
        int oddCount = 0;

        for (int i = 0; i < s.length(); i++) {
            counter[s.charAt(i) - 'a']++;
        }
        for (int value : counter) {
            if (value % 2 != 0) {
                oddCount++;
            }
        }
        return oddCount <= 1;
    }

    public static int minSwaps(String inp) {
        if (!isValid(inp)) {
            return -1;
        }

        int n = inp.length();
        char s[] = inp.toCharArray();
        int count = 0;
        for (int i = 0; i < n / 2; i++) {
            int left = i;
            int right = n - left - 1;
            while (left < right) {
                if (s[left] == s[right]) {
                    break;
                } else {
                    right--;
                }
            }
            if (left == right) {
                // s[left] is the character in the middle of the palindrome
                char t = s[left];
                s[left] = s[left + 1];
                s[left + 1] = t;
                count++;
                i--;
            } else {
                for (int j = right; j < n - left - 1; j++) {
                    char t = s[j];
                    s[j] = s[j + 1];
                    s[j + 1] = t;
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();
        scanner.close();
        int res = minSwaps(inp);
        System.out.println(res);
    }
}
