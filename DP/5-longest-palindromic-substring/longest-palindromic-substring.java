class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();n=n*2+1;
        char arr[]= new char[n];
        int p[]=new int[n];
        for(int i=0;i<n-1;i++)
        {
            arr[i]=(i%2==0)?'#':s.charAt(i/2);
        }
        arr[n-1]='#';
        System.out.println(Arrays.toString(arr));
        int l=0,l2=0,r=0;
        for(int i=1;i<n;i++)
        {

            
            if (i < r) {
                p[i] = Math.min(r - i, p[l2+r-i]);
            }
            while(i-p[i]-1>-1 && i+p[i]+1<n && arr[i-p[i]-1]==arr[i+p[i]+1])
            {
                p[i]++;
            }
            if(r<i+p[i])
            {r=i+p[i];l2=i-p[i];}

        }
        int max = p[0],k=0;
        for (int i = 1; i < p.length; i++)
            if (p[i] > max)
            {    max = p[i];k=i;}
        k=k/2-max/2;
        if(n%2==0)
        {k=k-1;
        }
        return s.substring(k,k+max);
    }
}