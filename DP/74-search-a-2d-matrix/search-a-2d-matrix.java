class Solution {
    public boolean findd(int arr[],int target)
    {
        int s=0,e=arr.length-1;
        while(s<=e)
        {
            int mid=(s+e)/2;
            if(arr[mid]==target)
            return true;
            else if(arr[mid]>target) e=mid-1;
            else s=mid+1;
        }
        return false;
    }
    public boolean searchMatrix(int[][] arr, int target) {
        int n=arr.length,s=0,e=n-1,m=arr[0].length-1;
        while(s<=e)
        {
            int mid=(s+e)/2;
            if(arr[mid][0]==target)
            {
                return true;
            }
            else if(arr[mid][0]>target)
            {
                e=mid-1;
            }
            else
            {
                if(target<=arr[mid][m])
                {
                    return findd(arr[mid],target);
                }
                s=mid+1;
            }
        }
        return false;
    }
}