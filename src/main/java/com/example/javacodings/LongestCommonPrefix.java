package com.example.javacodings;



public class LongestCommonPrefix {
    static String longestCommonPrefix(String arr[]) {
        String prefix = arr[0];
        for (int i = 1; i < arr.length; i++) {
            while (arr[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }

        }
        return prefix;
    }
    public static void main(String args[])
    {
        String arr[] ={"flooring","flower","flow","flop"};
        System.out.print("longestCommonPrefix"+":"+" " +longestCommonPrefix(arr));
    }
}

