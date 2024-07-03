package com.interview.question;

public class BestTimeToBuyAndSell_I {
    public static void main(String args[]) {
        BestTimeToBuyAndSell_I bttbas=new BestTimeToBuyAndSell_I();
        int arr[] = {7, 1, 5, 3, 6, 4};
      System.out.println(bttbas.buyAndSell(arr));
    }
    int buyAndSell(int[] dp)
    {
                int min=dp[0];
                int profit=0;
                int cost=0;
                for(int i=1;i<dp.length;i++)
                {
                    cost=dp[i]-min;
                    profit=Math.max(profit,cost);
                    min=Math.min(min,dp[i]);
                }
                return profit;
            }
        }

