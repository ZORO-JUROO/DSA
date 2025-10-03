class Solution {
    public String countAndSay(int n) {
        StringBuilder arr[]=new StringBuilder[n];
        arr[0] = new StringBuilder();
        arr[0].append("1");
        for(int i=1;i<n;i++)
        {
            arr[i]=new StringBuilder();
            String s=arr[i-1].toString();
            char c=s.charAt(0);
            int j=1,m=s.length();
            while(j<=m)
            {
                int k=1;
                while(j<m && s.charAt(j)==c)
                {
                    j++;k++;
                }
                arr[i].append(Integer.toString(k)+c);
                if(j<m){c=s.charAt(j);}j++;
            }
        }
        return arr[n-1].toString();
    }
}