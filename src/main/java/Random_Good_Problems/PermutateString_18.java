package main.java.Random_Good_Problems;

import java.util.HashSet;
import java.util.Set;

class PermutateString_18 {

    private static Set<String> permutate(String prefix, String str, Set<String> perms) {
        System.out.println("Prefix : "+prefix+" String : "+str);
        if (str.length() == 0) {
            System.out.println(" string exhausted ...adding to SET : "+prefix);
            perms.add(prefix);
        }

        for (int i = 0; i < str.length(); i++) {
            System.out.println(" current prefix "+(prefix+str.charAt(i)));
            System.out.println("sub 1 "+str.substring(0,i));
            System.out.println("sub 2 "+str.substring(i+1));
            permutate(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1), perms);
        }

        return perms;
    }

    public static Set<String> permutate(String str) {
        return permutate("", str, new HashSet<>());
    }

    public static void main(String[] args) {
        permutate("AB").forEach(System.out::println);
    }

}