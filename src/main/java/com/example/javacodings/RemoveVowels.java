package com.example.javacodings;

import java.io.*;

class GFG {
    public static void main(String[] args) {
        String str = "Our Unique World";
        StringBuilder sb = new StringBuilder(str);
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == 'A' || str.charAt(i) == 'I' || str.charAt(i) == 'O' ||
                    str.charAt(i) == 'E' || str.charAt(i) == 'U' || str.charAt(i) == 'a' ||
                    str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' ||
                    str.charAt(i) == 'u') {
                sb.deleteCharAt(i);
            }
        }
        System.out.println(sb);
    }
}