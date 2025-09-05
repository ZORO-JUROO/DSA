class Solution {
    public void reverse(int i,int arr[])
    {
        
        int n=arr.length-1;
        while(i<n)
        {
            int t=arr[i];arr[i++]=arr[n];arr[n--]=t;
        }
    }
    public void nextPermutation(int[] arr) {
        int n=arr.length,ind=-1;
        //find break point
        for(int i=n-1;i>0;i--)
        {
            if(arr[i]>arr[i-1])
            {
                ind=i-1;
                break;
            }
        }
        if(ind!=-1)
        {
            //swap break point with smallest number on its right that is greater than it
            for(int i=n-1;i>ind;i--)
            {
                if(arr[i]>arr[ind])
                {int t=arr[i];arr[i]=arr[ind];arr[ind]=t; break;}
            }
        }
        //reverse the rightpart of th break point;
        reverse(ind+1,arr);
    }
}