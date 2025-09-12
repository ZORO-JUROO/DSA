class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
    int n=arr.length;
    HashSet<List<Integer>> set=new HashSet<>();
    Arrays.sort(arr);
    for(int i=0;i<n;i++)
    {
        if(i!=0 && arr[i]==arr[i-1])
        {continue;}
        int s=i+1,e=n-1;
        while(s<e)
        {
            int sum=arr[i]+arr[s]+arr[e],sc=0,ec=0;
            if(sum==0)
            {set.add(Arrays.asList(arr[i],arr[s],arr[e]));sc=1;ec=1;}
            else if(sum<0)
            {sc=1;}
            else
            {ec=1;}
            if(sc==1){s++;while(s<e && arr[s]==arr[s-1]){s++;}}
            if(ec==1){e--;while(s<e && arr[e]==arr[e+1]){e--;}}
        }
    }
    return new ArrayList<>(set);
    }
}