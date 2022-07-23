package main.java.Array;

public class CheckPalindrome {


    private static boolean isPalindrome(String str) {
        char[] chars = str.toCharArray();

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) return false;
            start++;
            end--;
        }

        return true;
    }


    public static void main(String[] args) {

        System.out.println("String is palindrome ? : " + isPalindrome("pool"));
    }
}
