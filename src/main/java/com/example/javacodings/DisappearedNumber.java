package com.example.javacodings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DisappearedNumber {
    static int [] disappearedNumber(int arr[])
    {int j=1;
        List<Integer> resultList=new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0;i< arr.length;) {
            if (arr[i] == j) {
               j++;
               i++;
                     }
            else {
        resultList.add(j);
        j++;
    }
}
int resultArray[]= resultList.stream().mapToInt(Integer::intValue).toArray();
        return resultArray;
    }
    public static void main(String args[])
    {
        int arr[] ={1,2,10,9,4,11};
        int sortedArray[]= disappearedNumber(arr); /*To Print an array you have to traverse it*/
        for(int i:sortedArray)      /* i pointing to the element of object not index */
            System.out.print(i+" ");
    }
}
