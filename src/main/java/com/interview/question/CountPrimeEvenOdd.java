package com.interview.question;

public class CountPrimeEvenOdd {
    public static void main(String args[]) {
        int n = 20;
       System.out.println(countPrimes(n));
    }
        public static int countPrimes(int n) {
            int count=0;
            for(int i=2;i<n;i++)
            {
                int j=2;
                while(j<i/2)
                {
                    if(i%j==0)
                        count++;
                    j++;
                }
            }

            return count;
        }
    }

