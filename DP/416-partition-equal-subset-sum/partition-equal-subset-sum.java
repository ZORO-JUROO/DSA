class Solution {
    int dp[][];
    int k(int i,int target,int a[])
    {
        if(i<0)
        {
            return 0;
        }
        else
        {
            if(dp[i][target]!=-1){ return dp[i][target];}
            else if(a[i]==target){dp[i][target]=1;}
            else{
            if(k(i-1,target,a)==1) dp[i][target]=1;
            else{
            if(a[i]>target){dp[i][target]=0;} else
            if(k(i-1,target-a[i],a)==1) dp[i][target]=1; else dp[i][target]=0;}}
            return dp[i][target];
        }
    }
    public boolean canPartition(int[] nums) {
        int n=nums.length,s=0;
        for(int i=0;i<n;i++)
        {
            s+=nums[i];
        }
        if(s%2==0)
        {
            s=s/2;
            dp=new int[n][s+1];
            for (int i = 0; i < n; i++) {
                Arrays.fill(dp[i], -1);
            }

            if(k(n-1,s,nums)==1) return true; else return false;
            
        }
        else
        return false;


    }
}