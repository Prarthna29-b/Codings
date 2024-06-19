package com.interview.question;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class WordBreakProblem {
    public static void main(String[] args) {
        String s = "catsandog";
        String[] arr = {"cats","dog","sand","and","cat"};
        boolean result = wordBreakProblem(s, arr);
        System.out.println(result);  // Should print: true
    }

    static boolean wordBreakProblem(String s, String[] arr) {
        Set<String> set = new HashSet<>();
        for (String word : arr) {
            set.add(word);  //adding all the elements in set
        }
        boolean [] dp=new boolean[s.length()+1];// create an boolean type array of length string + 1 and as
        dp[0]=true;// bydefault it stores false at its all index now assign the first index true
        for(int i=1;i<=s.length();i++)//travarse the string from 1 to till it length
        {
            for(int j=0;j<i;j++)// use another loop to create a matched substring from 0 to i
            {
                if(dp[j]&&set.contains(s.substring(j,i))) //now check if dp[j] index is true which represent
                {//the last matched substring last index and set contains the substring if yes
                    dp[i]=true;//mark the postion of last index of last matched substring as true
                    break;
                }
            }
        }
        return dp[s.length()];//now retun the value at
    }
}
