package com.example.javacodings;

public class MoveZeroes {
    public static void main(String args[]) {
        int[] nums = {0, 1, 0, 3, 12, 0, 7, 8, 0};
        int j=1,i=0;
        while(j< nums.length&& i < nums.length) {
            if (nums[i] == 0 && nums[j] != 0) {
                nums[i] = nums[j];
                nums[j]=0;
                j++;
                i++;
            }
            else {
                j++;
            }
        }
            for(int k:nums)
            System.out.print(k + " ");
    }
}
