class Solution {
    int path(int i,int j,int dp[][])
    {
        if(i==0 && j==0)
        return 1;
        if(dp[i][j]!=-1)
        return dp[i][j];
        int up=(j-1==-1)?0:path(i,j-1,dp);
        int left=(i-1==-1)?0:path(i-1,j,dp);
        dp[i][j]=up+left;
        return dp[i][j];
    }
    public int uniquePaths(int m, int n) {
        int dp[][]=new int[m][n];
        Arrays.fill(dp[0],1);
        for(int i=1;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                int up=(j-1==-1)?0:dp[i][j-1];
                int left=(i-1==-1)?0:dp[i-1][j];
                dp[i][j]=up+left;
            }
        }
        return dp[m-1][n-1];
    }
}