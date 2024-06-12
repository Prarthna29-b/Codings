package com.example.javacodings;

public class NumberWithEvenNumberDigit {
   public static void main(String args[])
   {
       int arr[]={437,315,322,431,686,264,442};
       System.out.println(findNumbers(arr));
   }
        public static int findNumbers(int[] nums) {
            int digit=0, evenCount=0;
            for(int i=0;i<nums.length;i++) {
                int number = nums[i];
                while (number > 0) {
                    digit++;
                    number /= 10;
                }
                if (digit % 2 == 0)

                    evenCount++;
                digit = 0;
            }
            return evenCount;
        }
    }

