class Solution {
    String s1,s2;
    int dp[][],n,m;boolean p[][];
     public int find(char c,int i)
     {
        for(;i<s2.length();i++)
        {
            if(s2.charAt(i)==c)
            return i;
        }
        return -1;
     }
     public int dof(int i,int j){
        int max=0,q=i,w=j;
        if(i>=n  || j>=m)
        return 0;
        if(p[i][j]) return dp[i][j];
        for(;i<s1.length();i++)
        {
            int k=find(s1.charAt(i),j);
            if(k!=-1)
            {
                int c=1+dof(i+1,k+1);
                if(max<c)
                {
                    max=c;
                }
            }
        }
        dp[q][w]=max;
        p[q][w]=true;
        return max;
     }

    public int longestCommonSubsequence(String text1, String text2) {
        s1=text1;
        s2=text2;
        n=s1.length();
        m=s2.length();
        dp=new int[n][m];
        p=new boolean[n][m];
        return dof(0,0);
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