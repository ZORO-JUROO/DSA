class Solution {
    public int findDuplicate(int[] arr) {
        for(int i=0;i<arr.length;i++)
        {
            int p=Math.abs(arr[i]);
            if(arr[p]<0) return p;
            else
            arr[p]=-arr[p];
        }
        return -1;
    }
}