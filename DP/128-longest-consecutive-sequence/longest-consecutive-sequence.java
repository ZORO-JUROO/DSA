class Solution {
    public int longestConsecutive(int[] arr) {
        int n=arr.length,max=-1;
        if(n==0) return 0;
        Set<Integer> s=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            s.add(arr[i]);
        }
        for(int i:s)
        {
            if(s.contains(i-1))
            continue;
            int c=1,k=i;
            while(s.contains(k+1))
            {
                c++;k++;
            }
            max=Math.max(max,c);
        }
        return max;
    }
}