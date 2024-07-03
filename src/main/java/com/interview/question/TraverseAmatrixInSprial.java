package com.interview.question;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TraverseAmatrixInSprial {
    public static void main(String args[])
    {
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16},{17,18,19,20}};
        int top=0, left=0, bottom=matrix.length-1,right=matrix[0].length-1;
        List<Integer> res=new ArrayList<>();
        while(top<=bottom&&left<=right)
        {
            for(int i=left;i<=right;i++)  //traverse from left to right
            {
                res.add(matrix[left][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++)  //traverse from top to bottom
            {
                res.add(matrix[i][right]);
            }
            right--;
            for(int i=right;i>=left;i--)   //traverse from right to left
            {
                res.add(matrix[bottom][i]);
            }
            bottom--;
            for(int i=bottom;i>=top;i--)  //traverse from bottom to top
            {
                res.add(matrix[i][left]);
            }
            left++;
        }
        for(int i:res)
            System.out.print(i+" ");
    }
}
