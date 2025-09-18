class Solution {

    public int countSubstrings(String s) {
        int count=0,n=s.length();
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                int start=i,end=j;
                while(start<end)
                {
                    if(s.charAt(start)!=s.charAt(end))
                    break;
                    start++;
                    end--;
                }
                if(start>=end)
                count++;
            }
        }
        return count;
    }
}