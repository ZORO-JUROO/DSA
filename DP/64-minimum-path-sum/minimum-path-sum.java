class Solution {
    int n,m;boolean s[][];
    public int st(int i,int j,int arr[][]){
        if(i==n-1 && j==m-1 || s[i][j]==true)
            return arr[i][j];
        else
        {
            if(i+1<n)
            {
                int a=st(i+1,j,arr);
                if(j+1<m)
                        arr[i][j]+=Math.min(a,st(i,j+1,arr));
                else
                    arr[i][j]+=a;

            }
            else
            {
                arr[i][j]+=st(i,j+1,arr);
            }
            s[i][j]=true;
            return arr[i][j];
        }
    }
    public int minPathSum(int[][] grid) {
        n=grid.length;m=grid[0].length;
        s=new boolean[n][m];
        return st(0,0,grid);
    }
}