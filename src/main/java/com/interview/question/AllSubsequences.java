package com.interview.question;

import java.util.ArrayList;
import java.util.List;

public class AllSubsequences {
    static List<String> al = new ArrayList<>();
    public static void main(String[] args)
    {
        String s = "abc";
        int[] arr={3,1,2};
        List<Integer>list =new ArrayList<>();
        findSubsequencesOfString(s, ""); // Calling a function
        findSubsequencesOfArray(list,arr,0);
        System.out.println(al);
    }
    private static void findSubsequencesOfString(String s, String ans)
    {
        if (s.length() == 0) {
            al.add(ans);
            return;
        }
        findSubsequencesOfString(s.substring(1), ans + s.charAt(0));
        findSubsequencesOfString(s.substring(1), ans);
    }
    private static void findSubsequencesOfArray(List<Integer> list, int[] arr, int index){
       if(index==arr.length) {
           if(list.size()>0)
           System.out.println(list);
       }else {
           findSubsequencesOfArray(list, arr, index + 1);
           list.add(arr[index]);
           findSubsequencesOfArray(list, arr, index + 1);
           list.remove(list.size() - 1);
       }
    }
}
