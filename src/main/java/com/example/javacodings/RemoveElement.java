package com.example.javacodings;

import java.util.ArrayList;
import java.util.List;

public class RemoveElement {
    public static int[] removeElement(int[] nums, int val) {
        List<Integer> result =new ArrayList<>();
        for(int i:nums)
        {
            if(nums[i]!=val)
            {
                result.add(nums[i]);
            }
        }
        int[] intArray = result.stream().mapToInt(Integer::intValue).toArray();
        return intArray;
    }
    public static void main(String[] args)
    {
        int[] array1 ={3,2,2,3,4,5};
        int sortedArray[]=removeElement(array1, 3); /*To Print an array you have to traverse it*/
        for(int i:sortedArray)
            System.out.print(i+" ");
    }
}
