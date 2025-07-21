class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> f=new HashMap<>();
        int n=s.length(),index=0,max=0,i;
        for(i=0;i<n;i++)
        {
            char a=s.charAt(i);
            if(f.get(a)==null)
            {
                f.put(a,i);
            }
            else
            {
                max=Math.max(max,i-index);
                int v=f.get(a);
                for(;index<v;index++)
                {f.remove(s.charAt(index));}
                index+=1;
                
                f.replace(a,i);
            }
        }
        max=Math.max(max,i-index);
        return max;
    }
}