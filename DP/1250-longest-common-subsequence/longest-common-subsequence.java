class Solution {
    String s1,s2;
    int dp[][],n,m;boolean p[][];
     public int dof(int i,int j){
        if(i<0 ||j<0)
        return 0;
        if(p[i][j])
        return dp[i][j];
        if(s1.charAt(i)==s2.charAt(j))
        dp[i][j]=1+dof(i-1,j-1);
        else
        dp[i][j]=Math.max(dof(i-1,j),dof(i,j-1));
        p[i][j]=true;
        return dp[i][j];
     }

    public int longestCommonSubsequence(String text1, String text2) {
        s1=text1;
        s2=text2;
        n=s1.length();
        m=s2.length();
        dp=new int[n][m];
        p=new boolean[n][m];
        return dof(n-1,m-1);
    }
}

/*class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        s1=text1;
        s2=text2;
        arr=new int[s1.length][2];
        for()
        return dof(0,0);
    }
}*/