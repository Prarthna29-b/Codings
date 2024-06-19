package com.interview.question;


import java.util.*;

public class DisappearedNumbers {
    public static void main(String[] args) {
        int[] nums = {4, 3, 5, 2, 1, 0};
        List<Integer> res = new ArrayList<>();
//        System.out.println(allDisappearedNumber(res, nums));
        System.out.println(smallestPositiveMissingInteger(nums));
    }
 static List<Integer> allDisappearedNumber(List<Integer>res, int []nums)
 {
        // Step 1: Mark the presence of each number
        for(int i=0;i<nums.length;i++) {
            int index=Math.abs(nums[i])-1; // Find the index for the current number eg: for 4 index should be 3
            // and here -1 to make
            // it as zero index Math.abs(nums[i]): Take the absolute value of the current element
            // (to handle already marked negative values).
            if(nums[index]>0)              // If the number at that index is positive
                nums[index]=-nums[index];  // Mark it as visited by negating the value
        }

        // Step 2: Collect numbers that are still positive (those indices are missing numbers)
        for(int i =0;i<nums.length;i++) {
            if(nums[i]>0)                  // If the number at index i is positive
                res.add(i+1);              // The number i+1 is missing
        }

        return res;           // Print the list of missing numbers
    }

         static int smallestPositiveMissingInteger(int[] nums) {
         Set<Integer> set =new HashSet<>();
         for(int i:nums)
         {
             set.add(i);
         }
         int i=0;
         while(true)
         {
             if(!set.contains(i))
                 return i;
             i++;
         }
     }
     }


