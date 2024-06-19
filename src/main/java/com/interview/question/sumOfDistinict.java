package com.interview.question;

import java.util.HashSet;
import java.util.Set;

public class sumOfDistinict {
    public static void main(String[] args)
    {
        int arr[]={1,2,4,5,4,5,6};
        System.out.println(sumOfDistinict(arr));
    }
    static int sumOfDistinict(int[]arr)
    {
        Set<Integer> set =new HashSet<>();
        int sum=0;
        for(int i:arr) {
            if (set.add(i)) {//Using add method on a Set already returns a boolean indicating
                // if the element was added or not if true then add with sum
                sum += i;
            }
        }
        return sum;
    }
}
