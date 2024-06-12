package com.example.javacodings;

public class MaxConsecutiveOnes {
    public static void main(String args[]) {
        int arr[] = {1, 1, 0, 1, 1, 1};
        int max=0 , res =0;
//        Don't use forEach Loop because it works on element not on index
        for (int i=0;i<arr.length;i++) {
            if (arr[i] == 1)
                max++;
            else {
                res = Math.max(res, max);
                max = 0;
            }
        }
//        To get maximum value between res and max  when  the end element is 1.
        System.out.println(Math.max(res,max));
    }
}
