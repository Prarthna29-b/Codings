package com.interview.question;

public class SmallestElement {
    public static void main(String[]args)
    {
        String arr[]={ "mobile", "mouse", "monitor", "mousepad", "moneybox" };
        smallestLixcographical(arr);
    }
    static void smallestLixcographical(String [] arr)
    {
        String smallest=arr[0];// always assign 1st element to comparsion
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i].compareTo(smallest)<0)//here compareTo method used to compare the two
                // Strings Lexicographical it returns integer value -1 when arr[i] i less than smallest , 0 when
//                arr[i] is equal to smallest and 1 when arr[i] is greater than smallest
                smallest=arr[i];
        }
        System.out.println(smallest);
    }
}
