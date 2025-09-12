class Solution {
    public List<List<Integer>> fourSum(int[] arr, int target) {
        ArrayList<List<Integer>> a=new ArrayList<>();
        int n=arr.length;
        Arrays.sort(arr);
        for(int i=0;i<n;i++)
        {
            if(i!=0 && arr[i]==arr[i-1])
            {continue;}
            for(int j=i+1;j<n;j++)
            {
                if(j!=i+1 && arr[j]==arr[j-1])
            {continue;}
                int s=j+1,e=n-1;
                while(s<e)
                {
                    long sum=(long)arr[i]+arr[j]+arr[s]+arr[e];
                    if(sum==target)
                    {a.add(Arrays.asList(arr[i],arr[j],arr[s],arr[e]));
                    s++;e--; while(s<e && arr[s]==arr[s-1]){s++;}
                    while(s<e && arr[e]==arr[e+1]){e--;}
                    }
                    else if(sum<target)
                        s++;
                    else
                        e--;
                }
            }
        }
        return a;
    }
}