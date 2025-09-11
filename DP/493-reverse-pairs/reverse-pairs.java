class Solution {
    static int mergeS(int arr[],int l,int mid,int r)
    {
        int n1=mid-l+1,n2=r-mid;
        int left[]=new int[n1];
        int right[]=new int[n2];
        for(int i=0;i<n1;i++)   left[i]=arr[l+i];
        for(int i=0;i<n2;i++)   right[i]=arr[mid+1+i];
        int i=0,j=0,swap=0,s=0,k=l;
        while(i<n1)
        {
            for(;j<n2;j++)
            {
                if(left[i]>2*(long)right[j])
                s++;
                else
                break;
            }
            swap+=s;
            i++;
        }
        i=0;j=0;
        while(i<n1 && j<n2)
        {
            if(left[i]>right[j])
            {
                arr[k++]=right[j++];
            }
            else
            {
                arr[k++]=left[i++];
            }
        }
        while(i<n1)
        {
            arr[k++]=left[i++];
        }
        while(j<n2)
        {
            arr[k++]=right[j++];
        }
        return swap;
    }
    static int merge(int arr[],int l,int r)
    {
        if(l<r)
        {
            int mid=(l+r)/2;
            int count=merge(arr,l,mid);
            count+=merge(arr,mid+1,r);
            count+=mergeS(arr,l,mid,r);
            return count;
        }
        else
        return 0;
    }
    public int reversePairs(int[] arr) {

        int a=merge(arr, 0, arr.length - 1);
                return a;
    }
}