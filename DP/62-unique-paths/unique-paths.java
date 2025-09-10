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
        for(int i=0;i<m;i++)
        Arrays.fill(dp[i],-1);
        return path(m-1,n-1,dp);
    }
}