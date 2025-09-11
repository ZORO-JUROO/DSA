class Solution {
    public List<List<Integer>> fourSum(int[] arr, int target) {
        Set<List<Integer>> a=new HashSet<>();
        int n=arr.length;
        Arrays.sort(arr);
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int s=j+1,e=n-1;
                while(s<e)
                {
                    long sum=(long)arr[i]+arr[j]+arr[s]+arr[e];
                    if(sum==target)
                    {a.add(Arrays.asList(arr[i],arr[j],arr[s],arr[e]));
                    s++;e--;
                    }
                    else if(sum<target)
                        s++;
                    else
                        e--;
                }
            }
        }
        return new ArrayList<List<Integer>>(a);
    }
}