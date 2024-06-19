package com.interview.question;

public class SwapTwoNumbersWithoutThirdVariable {
    public static void main(String []args) {
        int a = 10, b = 20;
        String c="Hello",d="World";
        swapTwoNumbers(a, b);
        swapTwoString(c, d);
    }
      static void swapTwoNumbers(int a,int b){
        int c=a+b;
        a=c-a;
        b=c-b;
        System.out.println("a:"+a+"b:"+b);
    }
    static void swapTwoString(String c,String d)
    {
     String a=c.concat(d);
     d=a.substring(0,c.length());
     c=a.substring(c.length());
        System.out.println("d:" +d +" "+"c:"+c);
    }
}
