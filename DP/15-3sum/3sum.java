class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
    int n=arr.length;
    ArrayList<List<Integer>> set=new ArrayList<>();
    Arrays.sort(arr);
    for(int i=0;i<n;i++)
    {
        if(i!=0 && arr[i]==arr[i-1])
        {continue;}
        int s=i+1,e=n-1;
        while(s<e)
        {
            int sum=arr[i]+arr[s]+arr[e];
            if(sum==0)
            {set.add(Arrays.asList(arr[i],arr[s],arr[e]));s++;e--;
                        while(s<e && arr[s]==arr[s-1]){s++;}
                        while(s<e && arr[e]==arr[e+1]){e--;}}
            else if(sum<0)
            {s++;}
            else
            {e--;}
        }
    }
    return set;
    }
}