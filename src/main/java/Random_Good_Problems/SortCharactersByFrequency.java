package main.java.Random_Good_Problems;

import java.util.HashMap;
import java.util.Map;

public class SortCharactersByFrequency {


    //Return string sorted by frequency of characters
    public String frequencySort(String s) {
        StringBuilder sb = new StringBuilder();
        Map<Character, Integer> charCountMap = new HashMap<>();
        int len = s.length();
/*
Traverse a string,
store each character and it's count in a map
*/
        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }
/*
Sort this map by frequency.
*/
        charCountMap.entrySet().stream().sorted(Map.Entry.<Character, Integer>comparingByValue().reversed()).forEach(record -> {
            Character key = record.getKey();
            int value = record.getValue();
//Append the character by the number of times it occurrs.
            for (int i = 0; i < value; i++) {
                sb.append(key);
            }
        });
        return sb.toString();
    }

    public static void main(String[] args) {

    }
}
