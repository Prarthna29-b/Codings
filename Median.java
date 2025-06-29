package org.example.interview;

import java.util.Arrays;

public class Median {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int n=nums1.length, m=nums2.length,i=0,j=0,k=0;
            double sum=0;
            int res[]=new int[n+m];
            while(i<n||j<m)
            {
                if(i<n)
                {
                    res[k++]=nums1[i];
                    i++;
                }
                if(j<m)
                    res[k++]=nums2[j];
                j++;
            }
            Arrays.sort(res);
            int l=res.length;
            int in=l/2;
            if(l%2==0)
            {

                sum=(res[in-1]+res[in])/2.0;
            }
            else
                sum=res[in];

            return sum;
        }
    public static void main(String[] args) {
        Median median = new Median();
        int[] nums1 = {1, 3};
        int[] nums2 = {2,4};
        double result = median.findMedianSortedArrays(nums1, nums2);
        System.out.println("Median: " + result); // Output: Median: 2.0
    }

    }

