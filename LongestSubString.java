package org.example.interview;

import java.util.HashSet;

class LongestSubString {
        public int lengthOfLongestSubstring(String s) {
            HashSet<Character> set=new HashSet<>();
            int i=0,result=0,j=0;
            while(i<s.length()){
                if(!set.contains(s.charAt(i))){
                    set.add(s.charAt(i));
                    result =Math.max(result ,set.size());
                    i++;
                }
                //we use j to remove the characters from the set until we find a new character
                else   {
                    set.remove(s.charAt(j)); // Remove the character at index j so that we can move the start of the substring forward BUT
                    //i will not move forward until we find a new character
                    j++;
                }
            }
            return result;
        }

        public static void main(String[] args) {
            LongestSubString lss = new LongestSubString();
            String input = "abcaebcdbgb";
            int result = lss.lengthOfLongestSubstring(input);
            System.out.println("Length of the longest substring without repeating characters: " + result);
        }
}
