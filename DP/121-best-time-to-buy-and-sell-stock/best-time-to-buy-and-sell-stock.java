class Solution {
    public int maxProfit(int[] arr) {
        int s=arr[0],max=0;
        for(int i=0;i<arr.length;i++)
        {
            if(s>=arr[i])
            {
                s=arr[i];
            }
            if(s<arr[i])
            {
                max=Math.max(max,arr[i]-s);
            }
        }
        return max;
    }
}