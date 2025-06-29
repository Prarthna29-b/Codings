package org.example.interview;

   public class Solution {
       public int[] productExceptSelf(int[] nums) {
           int res[] = new int[nums.length];
           res[0] = 1;
           int prod = 1, j = nums.length - 1;
           for (int i = 1; i < nums.length; i++)
               res[i] = res[i - 1] * nums[i - 1];//i=1,res[0]*nums[i-1] = 1*1, i=2 res[1]*nums[i-1] = 1*2, res[2]*nums[i-1] = 2*3, res[3]*nums[i-1] = 6*4
           for (int i = j ; i >= 0; i--) {//res[3] = 6, res[2] = 2, res[1] = 1, res[0] = 1
//               res{1,1,2,6} = {1,1,2,6}*{4,3,2,1} = {24,12,4,1}
               res[i] = res[i] * prod;     //i=3, res[3] = 6*1, i=2, res[2] = 2*4, i=1, res[1] = 1*12, i=0, res[0] = 1*24
               prod = prod * nums[i];  // 1*4, 4*3, 12*2, 24*1
           }
         return res;//res{24,12,8,6}
       }

       public static void main(String[] args) {
              Solution solution = new Solution();
              int[] nums = {1, 2, 3, 4};
              int[] result = solution.productExceptSelf(nums);
              for (int num : result) {
                System.out.print(num + " ");
              }
       }
   }
