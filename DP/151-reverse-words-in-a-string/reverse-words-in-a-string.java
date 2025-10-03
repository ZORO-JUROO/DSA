class Solution {
    public String reverseWords(String s) {
        s=s.trim()+" ";int n=s.length(),l=0;
        String ans="",f="";
        for(int i=0;i<n;i++)
        {
            while(i<n && s.charAt(i)!=' ')
            {
                f=f+s.charAt(i);
                i++;
            }
            if(l!=i)
            ans=f+ " "+ans;
            l=i+1;
            f="";
        }
        return ans.trim();
    }
}