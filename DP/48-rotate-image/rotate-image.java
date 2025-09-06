class Solution {
    void reverse(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<n/2;i++)
        {
            int t=arr[i];arr[i]=arr[n-i-1];arr[n-i-1]=t;
        }
    }
    public void rotate(int[][] arr) {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                int t=arr[j][i];arr[j][i]=arr[i][j];arr[i][j]=t;
            }
        }
        for(int i=0;i<n;i++)
        {
            reverse(arr[i]);
        }
    }
}