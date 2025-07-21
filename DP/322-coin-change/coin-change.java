class Solution {
    public int coinChange(int[] coins, int a) {
        int n=coins.length;
        int dp[][]=new int[n][a+1];
        for (int j = 1; j <= a; j++) {
            if (j % coins[0] == 0) {
                dp[0][j] = j / coins[0];
            } else {
                dp[0][j] = -1; 
            }
        }
        for(int i=1;i<n;i++)
        {
            for(int j=0;j<=a;j++)
            {
                int prev=dp[i-1][j];
                if(prev==-1)
                {
                    dp[i][j]=-1;
                    if(coins[i]<=j && dp[i][j-coins[i]]!=-1)
                    {
                        dp[i][j]=1+dp[i][j-coins[i]];
                    }
                }
                else
                {
                    dp[i][j]=prev;
                    if(coins[i]<=j && dp[i][j-coins[i]]!=-1)
                    {
                        dp[i][j]=Math.min(dp[i][j],1+dp[i][j-coins[i]]);
                    }
                }
            }
        }
        return dp[n-1][a];
    }
}