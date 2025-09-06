class Solution {
    public void rotate(int[][] arr) {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n/2;j++)
            {
                int t=arr[j][i];arr[j][i]=arr[n-j-1][i];arr[n-j-1][i]=t;
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                int t=arr[j][i];arr[j][i]=arr[i][j];arr[i][j]=t;
            }
        }
    }
}