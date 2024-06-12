package com.example.javacodings;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {
    public static int[] removeElement(int[] nums, int value) {
       Set<Integer> result =new HashSet<>();
        for(int i:nums)
        {
            if(!result.contains(nums[i]))
            {
                result.add(nums[i]);
            }
        }
        int[] intArray = result.stream().mapToInt(Integer::intValue).toArray();
        return intArray;
    }
    public static void main(String[] args)
    {
        int array1 []={3,2,2,3,4,5};
        int sortedArray[]= removeElement(array1, 3)  ; /*To Print an array you have to traverse it*/
        for(int i:sortedArray)      /* i pointing to the element of object not index */
            System.out.print(i+" ");
    }
}
