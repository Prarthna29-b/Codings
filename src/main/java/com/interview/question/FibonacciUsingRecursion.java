package com.interview.question;

public class FibonacciUsingRecursion {
    public static void main(String[] args)
    {
        int num =6; // fibonacciSeries to 5th element
        for (int i = 0; i <= num; i++) {            // loop is used to print the fibonacci series
            System.out.print(fibonacci(i) + " ");  // if you want to print only the nth element then no use of loop
        }         //   directly use fibonacci(num)
    }
    static int fibonacci(int n) {
        if (n == 1 || n == 0)
            return n;
        else
            return fibonacci(n -1) + fibonacci(n-2);  //to find any fibonacci nth element eg: 2nd so to print 2nd so you
    }                                             //need to add 1st and 0th element which we get (2-1)+(2-2)
}
