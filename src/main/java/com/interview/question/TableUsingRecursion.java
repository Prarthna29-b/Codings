package com.interview.question;

public class TableUsingRecursion {
    public static void main(String []args) {
        int num=2;
        table(num,10);
    }
    static void table(int num,int i) {
        if (i == 0)
            return;
        else {
            table(num, i - 1);
            System.out.println(num * i);
        }
    }
}
