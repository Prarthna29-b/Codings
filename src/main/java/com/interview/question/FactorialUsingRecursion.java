package com.interview.question;

public class FactorialUsingRecursion {
    public static void main(String[] args)
    {
        int num=4;
        System.out.println(factorial(num));
    }
   static int factorial(int n) {
        if(n == 1) {
            return n;
        }
        else {
            return n * factorial(n - 1);  //4*fact(3)-> 3*fact(2)->2*fact(1) because 4*3*2*1
        }
    }
}
