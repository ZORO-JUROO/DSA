class Solution {
    public int trap(int[] arr) {
        int n=arr.length;
        int rmax[]=new int[n],lmax[]=new int[n];
        lmax[0]=arr[0];rmax[n-1]=arr[n-1];
        for(int i=1;i<n;i++)
        lmax[i]=Math.max(lmax[i-1],arr[i-1]);
        for(int i=n-2;i>=0;i--)
        rmax[i]=Math.max(rmax[i+1],arr[i+1]);
        int total=0;
        for(int i=0;i<n;i++)
        {
            int min=Math.min(lmax[i],rmax[i])-arr[i];
            if(min>0)
            total+=min;
        }
        return total;
    }
}