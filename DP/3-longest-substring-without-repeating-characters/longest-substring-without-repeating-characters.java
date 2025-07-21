class Solution {
    public int lengthOfLongestSubstring(String s) {
        int arr[]=new int[128],n=s.length(),start=0,max=-1;
        Arrays.fill(arr,-1);
        for(int i=0;i<n;i++)
        {
            int c=s.charAt(i);
            if(arr[c]==-1)
            {
                arr[c]=i;
            }
            else
            {
                max=Math.max(max,i-start);
                while((int)s.charAt(start)!=c)
                {
                    arr[(int)s.charAt(start)]=-1;
                    start++;
                }
                start++;
                arr[c]=i;
            }
        }
         return Math.max(max,n-start);
    }
}