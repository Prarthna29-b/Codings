package com.interview.question;

public class MinimumSteps {
    public static void main (String []args)
    {
        int K=7;
        int[] dp =new int[K+1];
        System.out.println(minimumSteps(dp,K));
    }
    static int minimumSteps(int[] dp, int N)
    {
        dp[0]=0;
      for(int i=1;i<=N;i++)
      {
          dp[i]=dp[i-1]+1;
          if(i%2==0)
              dp[i]=Math.min(dp[i],dp[i/2]+1);
      }
      return dp[N];
    }
}
