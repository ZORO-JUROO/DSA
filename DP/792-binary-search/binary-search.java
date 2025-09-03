class Solution {
    public int search(int[] arr, int target) {
        int s=0,e=arr.length-1,i=-1;;
        while(s<=e){
            int m=(s+e)/2;
            if(arr[m]==target)
            {i=m;break;}
            else if(arr[m]>target)
                e=m-1;
            else s=m+1;
        }
        return i;
    }
}