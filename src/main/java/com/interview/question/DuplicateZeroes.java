package com.interview.question;

import java.util.ArrayList;
import java.util.List;

public class DuplicateZeroes {
    public static void main(String args[]) {
        int[] arr = {1, 0, 3, 0, 9, 0, 5, 4};
    }
    int [] duplicateZeroes(int[] arr)
    {
     List<Integer> array=new ArrayList<>();
     for(int i:arr) {
         if (i == 0) {
             array.add(i);
             array.add(0);
         } else {
             array.add(i);
         }
     }
     int res[]=new int[array.size()];
     return array.toArray(res);
}
