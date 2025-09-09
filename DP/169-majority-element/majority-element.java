class Solution {
    public int majorityElement(int[] arr) {
        int e=arr[0],c=1;
        for(int i=1;i<arr.length;i++)
        {
            if(c==0)
            e=arr[i];
            if(arr[i]==e)
            c++;
            else
            c--;

        }
        return e;
    }
}