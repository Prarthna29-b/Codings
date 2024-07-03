package com.example.javacodings;

import java.util.Arrays;

public class ReverseAsentences {
    public static void main(String [] args)
    {
        String sen="It is my lovely home";
        String[] arr =sen.split(" ");
      System.out.println (reverseEachWord(arr));
    }
   static String  reverseEachWord(String[] arr)
    {
       for(int i=0;i<arr.length;i++)
       {
           String word=arr[i];
           StringBuilder sb=sb=new StringBuilder();
           for(int j=word.length()-1;j>=0;j--)
           {
               sb.append(word.charAt(j));
               arr[i]= String.valueOf(sb);
           }
       }
       return Arrays.toString(arr);
    }
}
