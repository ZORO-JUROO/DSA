class Solution {
    public String reverseWords(String s) {
        s=s.trim()+" ";int n=s.length(),l=0;
        StringBuilder ans=new StringBuilder();StringBuilder f=new StringBuilder();
        for(int i=0;i<n;i++)
        {
            while(i<n && s.charAt(i)!=' ')
            {
                f.append(s.charAt(i));
                i++;
            }
            if(l!=i)
            {f.append(" ");ans.insert(0,f);}
            l=i+1;
            f.setLength(0);
        }
        ans.setLength(ans.length()-1);
        return ans.toString();
    }
}