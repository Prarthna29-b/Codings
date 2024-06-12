package com.example.javacodings;

import java.util.ArrayList;
import java.util.List;

public class DuplicateZeros {
    public static int[] duplicateZeros(int[] arr) {
        List<Integer> resultArray = new ArrayList();   /*define an Array with variable size*/
        for (int i : arr) {
            if (i == 0) {
                resultArray.add(i);
                resultArray.add(0);
            } else
                resultArray.add(i);
        }
        int[] intArray = resultArray.stream().mapToInt(Integer::intValue).toArray();

//         resultArray.stream(): This converts the ArrayList into a stream of elements.
//         mapToInt(Integer::intValue): This transforms each Integer element in the stream to its
//         corresponding int value. It's using the method reference Integer::intValue to get
//         the int value of each Integer.
//         toArray(): This collects the elements of the stream into an array.

        return intArray;
    }
    public static void main(String args[])
    {
        int arr[] ={1,0,2,3,0,4,5,0};
        int sortedArray[]= duplicateZeros(arr); /*To Print an array you have to traverse it*/
        for(int i:sortedArray)      /* i pointing to the element of object not index */
            System.out.print(i+" ");
    }
}
