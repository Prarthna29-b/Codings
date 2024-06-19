package com.interview.question;

public class ReverseString {
    public static void main(String args[]) {
        String str = "HelloWorld!";  // s,sf
//        StringBuilder sb = new StringBuilder();
//        for (int i = str.length() - 1; i >= 0; i--) {
//            sb.append(str.charAt(i));
//        }
//        System.out.println(sb);
        System.out.println(reverseString(str));
    }

    // Using Recursion
  static String  reverseString(String s)
    {
        if(s.length()<=1)
            return s;
        else
        return    s.charAt(s.length()-1)+reverseString(s.substring(0,s.length()-1));
    }
}
