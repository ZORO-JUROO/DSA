class Solution {
    public int maxSubArray(int[] arr) {
        int n=arr.length,s=0,sum=arr[0],max=arr[0];
        while(s<n && arr[s]<0 )
        {
            sum=Math.max(sum,arr[s]);
            s++;
        }
        System.out.println(s);
        if(s==n) return sum;
        sum=arr[s];max=sum;
        for(int i=s+1;i<n;i++)
        {
            if(arr[i]>=0)
            sum+=arr[i];
            else
            {
                if(max<sum)
                max=sum;
                if(sum+arr[i]<=0)
                sum=0;
                else
                sum+=arr[i];
            }
        }
        if(max<sum)
            max=sum;
        return max;
    }
}