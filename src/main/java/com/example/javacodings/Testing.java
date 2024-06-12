package com.example.javacodings;
class Testing {
    public static void main (String[] args) {
        int k=5;
         for(int i=0;i<5;i++) {
             for(int j=0;j<i;j++)
                 System.out.print(" ");
            for(int j=0;j<k;j++)
            {
                    System.out.print('*');
            }
            k--;
            System.out.println();
        }
    }
}