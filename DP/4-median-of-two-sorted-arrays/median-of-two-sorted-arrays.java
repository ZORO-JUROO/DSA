class Solution {
    public int find(int a,int arr[])
    {
        int low=0,high=arr.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==a)
            return mid;
            else if(arr[mid]>a)
                high=mid-1;
            else
            low=mid+1;
        }
        return -1;
    }
    public int gett(int a,int arr1[],int arr2[])
    {
        int low=0,high=arr1.length-1,s=0;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr1[mid]>a)
                high=mid-1;
            else
                low=mid+1;
        }
        s+=low;
        low=0;high=arr2.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr2[mid]>a)
                high=mid-1;
            else
                low=mid+1;
        }
        s+=low;
        return s;
    }
    public double findMedianSortedArrays(int[] arr1, int[] arr2) {
        if(arr1.length==0){return arr2.length%2==0?(((double)arr2[arr2.length/2]+arr2[arr2.length/2-1])/2):arr2[arr2.length/2];}
        if(arr2.length==0){return arr1.length%2==0?(((double)arr1[arr1.length/2]+arr1[arr1.length/2-1])/2):arr1[arr1.length/2];}
        int low=Math.min(arr1[0],arr2[0]),high=Math.max(arr1[arr1.length-1],arr2[arr2.length-1]);
        int min=(arr1.length+arr2.length)/2;
        while(low<=high)
        {
            int mid=(low+high)/2;
            int k=gett(mid,arr1,arr2);
            if(k<=min)
            low=mid+1;
            else
            high=mid-1;
        }
        double ans=low;
        if((arr1.length+arr2.length)%2==0)
        {
            min-=1;
            low=Math.min(arr1[0],arr2[0]);high=Math.max(arr1[arr1.length-1],arr2[arr2.length-1]);
            while(low<=high)
            {
                int mid=(low+high)/2;
                int k=gett(mid,arr1,arr2);
                if(k<=min)
                low=mid+1;
                else
                high=mid-1;
            }
            return (ans+low)/2;
        }
        return ans;
    }
}