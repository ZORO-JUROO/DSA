class Solution {
    public void setZeroes(int[][] arr) {
        int n=arr.length,m=arr[0].length,f=0;
        for(int i=0;i<m;i++)
            if(arr[0][i]==0){ f=1; break;
        }
        for(int i=1;i<n;i++)
        {
            int k=0;
            for(int j=0;j<m;j++)
            {
                if(arr[i][j]==0)
                {arr[0][j]=0;k=1;}
            }
            if(k==1)
            for(int j=0;j<m;j++)
            arr[i][j]=0;
        }
        
        for(int i=0;i<m;i++)
        {
            if(arr[0][i]==0)
            for(int j=0;j<n;j++)
            arr[j][i]=0;
        }
        if(f==1) Arrays.fill(arr[0],0);
    }
}