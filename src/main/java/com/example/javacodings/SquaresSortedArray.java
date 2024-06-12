package com.example.javacodings;

import java.util.Arrays;

public class SquaresSortedArray {
    public static int[] sortedSquares(int[] nums) {
        int res[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            res[i]=nums[i]*nums[i];  /* don't use Math.pow() because it;s retuen type is double */
        }
          Arrays.sort(res);    /* used to sort the array not to return array its return type is void */
        return(res);
    }
    public static void main(String args[])
    {
        int arr[] ={-7,-3,2,3,11};
        int sortedArray[]=sortedSquares(arr); /*To Print an array you have to traverse it*/
        for(int i:sortedArray)      /* i pointing to the element of object not index */
        System.out.print(i+" ");
    }
}
