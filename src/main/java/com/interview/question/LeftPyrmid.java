package com.interview.question;

public class LeftPyrmid {
        public static void main(String[] args)
        {
            int height=5;
            reverseLeftPyrmid(height);
            leftPyrmid(height);
        }
        static void reverseLeftPyrmid(int n)
        {
            for(int i=5;i>0;i--)
            {
                for(int j=i;j<n;j++)
                {
                    System.out.print(' ');
                }
                for(int k=1;k<=i;k++) {
                    System.out.print('*');
                }
                System.out.println();
            }
        }
        static void leftPyrmid(int n)
        {
            for(int i=1;i<=n;i++)
            {
                for(int j=i;j<n;j++)
                {
                    System.out.print(' ');
                }
                for(int k=1;k<=i;k++) {
                    System.out.print('*');
                }
                System.out.println();
            }
        }
    }


