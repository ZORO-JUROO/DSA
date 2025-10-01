class Solution {
    public int singleNonDuplicate(int[] arr) {
     int start=0,end=arr.length-1;
     while(start<=end)
     {
        int mid=(start+end)/2;
        System.out.println(start+" "+mid+" "+end);
        if(mid%2==0)
        {
            if(mid+1<=end && arr[mid]==arr[mid+1])
            start=mid+2;
            else if(mid-1>=start && arr[mid]==arr[mid-1])
            end=mid-2;
            else
            return arr[mid];
        }
        else
        {
            if(mid-1>=start && arr[mid]==arr[mid-1])
            start=mid+1;
            else if(mid+1<=end && arr[mid]==arr[mid+1])
            end=mid-1;
            else
            return arr[mid];
        }
     } 
     return -1;
    }
}