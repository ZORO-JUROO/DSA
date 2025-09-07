class Solution {
    public void merge(int[] arr, int m, int[] arr2, int n) {
        int i=0,j=0,b=0,k=0,k2=0;
        if(m==0)
        {for(;i<n;i++)arr[i]=arr2[i];return;}
        if(n==0) return;
        int arr3[]=new int[m];
        while(i<m)
        {
            if(b==0)
            {
            if(j<n &&arr[i]>arr2[j])
            {
                b=1;
                arr3[k++]=arr[i];
                arr[i]=arr2[j++];
            }
            }
            else
            {
            if(j<n && arr[i]>arr2[j] && arr2[j]<arr3[k2])
            {   arr3[k++]=arr[i];
                arr[i]=arr2[j++];
            }
            else
            {
                arr3[k++]=arr[i];
                arr[i]=arr3[k2++];
            }
            
            }
            i++;
        }
        int c=m;
            while(k2<k && j<n)
            {
                if(arr2[j]>arr3[k2])
                    arr[c++]=arr3[k2++];
                else
                    arr[c++]=arr2[j++];
            }
            while(k2<k){arr[c++]=arr3[k2++];}
            while(j<n){arr[c++]=arr2[j++];}
    }
    
}