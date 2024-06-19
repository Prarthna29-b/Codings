package com.interview.question;

public class ReverseRightHalfPyrmid {
    public static void main(String[] args)
    {
        int height=5;
        reverseRightPyrmid(height);
        rightPyrmid(height);
    }
    static void reverseRightPyrmid(int n)
    {
        for(int i=5;i>0;i--)
        {
            for(int j=0;j<i;j++)
            {
              System.out.print('*');
            }
            System.out.println();
        }
    }
    static void rightPyrmid(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
