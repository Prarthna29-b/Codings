package com.example.javacodings;

import java.util.*;
public class MergeUnSortedArray
{
    static int[] mergeUnSortedTwoArrayAsSingle(int[] array1, int[] array2)
    {
        int m= array2.length, i=0,j=0;
        int res[]=new int[array1.length];
        for(i=0;i< array1.length;i++)
            if(array1[i]==0) {
                res[i] = array2[j++];
            }
        else {                        /* else Block is needed to avoid indexOutOfBond */
                res[i] = array1[i];
            }
        Arrays.sort(res);
        return res;
    }
    public static void main(String[] args)
    {
        int array1 []={1,2,3,0,0,0};
        int array2 []={2,5,1};
       int resultArray[]= mergeUnSortedTwoArrayAsSingle(array1, array2 )  ;
        for(int i:resultArray)
            System.out.print(i+" ");
    }
}