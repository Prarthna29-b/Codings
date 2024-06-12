package com.example.javacodings;



import java.util.Arrays;

public class LongestCommonSubsequence {
    // Recursive function to find the Longest Common Subsequence (LCS)
    static String lcsUtil(String s1, String s2, int ind1, int ind2, int[][] dp) {
        // Base case: If either of the strings reaches the end, return an empty string
        if (ind1 < 0 || ind2 < 0)
            return "";

        // If the characters at the current indices are the same
        if (s1.charAt(ind1) == s2.charAt(ind2))
            // Include the current character in the LCS and recursively find the LCS of the remaining strings
            return lcsUtil(s1, s2, ind1 - 1, ind2 - 1, dp) + s1.charAt(ind1);
        else {
            // If the characters are different, choose the maximum LCS by either
            // skipping a character in s1 or skipping a character in s2
            String lcs1 = lcsUtil(s1, s2, ind1, ind2 - 1, dp);
            String lcs2 = lcsUtil(s1, s2, ind1 - 1, ind2, dp);
            // Return the longer LCS
            return (lcs1.length() > lcs2.length()) ? lcs1 : lcs2;
        }
    }

    // Function to find the Longest Common Subsequence (LCS)
    static String lcs(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();

        // Create a 2D array to store results of subproblems
        int dp[][] = new int[n][m];

        // Initialize the dp array with -1 to indicate that subproblems are not solved yet
        for (int rows[] : dp)
            Arrays.fill(rows, -1);

        // Call the recursive function to find the LCS
        return lcsUtil(s1, s2, n - 1, m - 1, dp);
    }

    public static void main(String args[]) {
        String s1 = "acdebca";
        String s2 = "ceabdec";

        // Call the lcs function and print the result
        System.out.println("The Longest Common Subsequence is: " + lcs(s1, s2));
    }
}

