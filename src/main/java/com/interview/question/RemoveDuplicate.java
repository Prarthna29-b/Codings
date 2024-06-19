package com.interview.question;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {
    public static void main(String [] args)
    {
        int[] arr={1,2,2,3,4,5,4,3};
       int[] result=removeDuplicate(arr);
       for(int i:result)
           System.out.println(i);
    }
    static int [] removeDuplicate(int[] arr)
    {
        Set<Integer> set =new HashSet<>();
    for(int i:arr)
    {
        set.add(i);
    }
        int [] res= new int[set.size()];
       int j=0;
       for(int i:set) {
           res[j++] = i;
       }
         return res;
    }
}
