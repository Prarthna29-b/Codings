package com.interview.question;

public class SecondMax {
    public static void main(String args[]) {
        int secondMax = 0, firstMax = 0;
        int[] arr = {7, 2, 7, 6, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > firstMax) {
                secondMax = firstMax;
                firstMax = arr[i];
            }
            if (arr[i] != firstMax && arr[i] > secondMax) {
                secondMax = arr[i];
            }
        }
        System.out.println(secondMax);
    }

}