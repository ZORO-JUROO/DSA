class Solution {
    public int searchInsert(int[] arr, int target) {
        int s =0,e=arr.length-1;
        while(s<=e)
        {
            int m=(s+e)/2;
            if(arr[m]==target){
                return m;
            }
            else if(arr[m]<target)
            {
                s=m+1;
            }
            else e=m-1;
        }
        return s;
    }
}