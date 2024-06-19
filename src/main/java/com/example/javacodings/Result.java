package com.example.javacodings;

import java.util.HashMap;
import java.util.Map;

public class Result {

        public static long repeatedString(String s, long n) {
            StringBuilder sb= new StringBuilder(s);
            for(int i =s.length();i<n;) {
                if ((n-i) >s.length() ) {
                    sb.append(s);
                    i = sb.length();
                }
                else {
                    sb.append(sb.substring(0, (int) ((s.length()-(n-i))-1)));
                    i=sb.length();
                }

            }
            HashMap<Character,Integer> map= new HashMap<>();
            int j=0;
            for(int i=0;i<sb.length();i++)
                if(!map.containsKey(sb.charAt(i)))
                    map.put(sb.charAt(i), 1);
            else
                map.put(sb.charAt(i), map.get(sb.charAt(i))+1);
            int highFrequency=0;
            for(Map.Entry<Character,Integer> entry:map.entrySet())
                highFrequency=Math.max(entry.getValue(),highFrequency);
            return highFrequency;
            // Write your code here

        }

        public static void main(String[] args) {

            long result = repeatedString("aba", 10);
            System.out.println(result);
        }
    }
