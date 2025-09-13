class Solution {
    public int lengthOfLongestSubstring(String s) {
        int arr[]=new int[256];
        Arrays.fill(arr,-1);
        int n=s.length(),max=0,count=0,st=0;
        for(int i=0;i<n;i++)
        {
            int index=s.charAt(i);
            if(arr[index]==-1)
            {
                count++;
                arr[index]=i;
            }
            else
            {
                max=Math.max(max,count);
                int upto=arr[index];
                count=i-upto;
                for(;st<=upto;st++)
                arr[s.charAt(st)]=-1;
                arr[index]=i;
            }

        }
        max=Math.max(max,count);
        return max;
    }
}