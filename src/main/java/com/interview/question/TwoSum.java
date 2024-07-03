package com.interview.question;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
        public int[] twoSum(int[] nums, int target) {
            int res[]=null;
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                int complement = target - nums[i];
                if (map.containsKey(complement)) {
                    res= new int[]{map.get(complement), i};
                }
                map.put(nums[i], i);
            }
        return res;
        }
        public static void main(String a[])
        {
            TwoSum twoSum=new TwoSum();
            int arr[]={3,2,3};
            int target=6;
               int res[] =twoSum.twoSum(arr,target);
               for(int i:res)
                   System.out.print(i+" ");
        }
}
