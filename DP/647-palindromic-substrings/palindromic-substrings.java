class Solution {

    public int countSubstrings(String s) {
        int count=0;
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            int st=i-1,e=i+1;
            while(st>=0 && e<n)
            {
                if(s.charAt(st)!=s.charAt(e))
                break;
                else
                st--;e++; count++;
            }
            st=i;e=i+1;
            while(st>=0 && e<n)
            {
                if(s.charAt(st)!=s.charAt(e))
                break;
                else
                st--;e++;
                count++;
            }
        }
        return count+n;
    }
}