//###
//Count the no of sequences of an array producing the targeted
//sum using the Recursion
//
///*package whatever //do not write package name here */
//
//import java.io.*;
//import java.util.*;
//
//class GFG {
//	public static void main (String[] args) {
//	    int arr[]={3,2,1,2};
//  System.out.println (f(0,arr,0));
//	}
//static int	f(int index,int arr[],int sum)
//	{
//	    int a,r=0;
//	    if(index==arr.length)
//	    {
//	 if(sum==3)
//	 return 1;
//	   return 0;
//	    }
//	 a=f(index+1,arr,sum);
//	   sum+=arr[index];
//	 r=f(index+1,arr,sum);
//	   sum-=arr[index];
//	   return a+r;
//	}
//}
//Output
//3
