package com.interview.question;

public class LongestCommonPrefix {
    public static void main(String[] args)
    {
    String [] str={"flower", "flow", "flight"};
    System.out.println(longestCommonPrefix(str));
}
static String longestCommonPrefix(String[] str)
{
    String prefix=str[0];
    for(int i=1;i<str.length;i++)
    {
     while(str[i].indexOf(prefix)!=0)//This checks if the string str[i] starts with the substring prefix.
                  //  If str[i].indexOf(prefix) is 0, it means prefix is at the very beginning of str[i].if index
         prefix=prefix.substring(0,prefix.length()-1);// is not 0 then continue decrease the length of the prefix
    } //from backside using substring unless prefix match with the str[i]
    return prefix;
}
}
