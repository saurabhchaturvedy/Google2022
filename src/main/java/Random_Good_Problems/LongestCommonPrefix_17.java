package main.java.Random_Good_Problems;

public class LongestCommonPrefix_17 {


    private static String longestCommonPrefix(String[] str) {
        StringBuilder longestCommonPrefix = new StringBuilder();

        if (str == null || str.length == 0) {
            return longestCommonPrefix.toString();
        }

        int minLength = str[0].length();

        for (String value : str) {
            minLength = Math.min(minLength, value.length());
        }

        for (int i = 0; i < minLength; i++) {
            char current = str[0].charAt(i);

            for (String s : str) {
                if (s.charAt(i) != current) {
                    return longestCommonPrefix.toString();
                }
            }

            longestCommonPrefix.append(current);
        }

        return longestCommonPrefix.toString();
    }


    public static void main(String[] args) {
        String[] str = {"flight", "fly"};
        System.out.println(longestCommonPrefix(str));
    }
}
