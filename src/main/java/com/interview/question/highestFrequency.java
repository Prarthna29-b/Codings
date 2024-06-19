package com.interview.question;

import java.util.HashMap;
import java.util.Map;

public class highestFrequency {
public static void main(String[]args)
{
    String str ="abcdabaabbacbcbb";
    highFreq(str);
}
static void highFreq(String str) {
    HashMap<Character, Integer> map = new HashMap<>();
    for (int i = 0; i < str.length(); i++) {
        if (!map.containsKey(str.charAt(i)))   //if map doesn't contains the key then put in map
            map.put(str.charAt(i), 1);
        else  //else just get value with corresponding Character(key) and update its value by 1
            map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
    }
    // Variables to store the character with the highest frequency and its frequency
    char maxChar = ' ';
    int maxFreq = 0;

    // Find the character with the highest frequency
    for (Map.Entry<Character, Integer> entry : map.entrySet()) {
        if (entry.getValue() > maxFreq) {
            maxFreq = entry.getValue();
            maxChar = entry.getKey();
        }
    }
    System.out.println("HighestFrequencyCharacter:"+maxChar+":"+maxFreq);
}}

