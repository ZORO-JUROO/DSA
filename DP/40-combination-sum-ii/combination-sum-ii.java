class Solution {
    void rec(int arr[],int i,Set<List<Integer>> set, ArrayList<Integer> ad,int sum,int target)
    {
        if(sum==target)
        {set.add(new ArrayList<>(ad));return;}
        if(sum>target)
        return;
        int k=-1;
        for(;i<arr.length;i++)
        {
            if(k!=arr[i])
            { ad.add(arr[i]);
            rec(arr,i+1,set,ad,sum+arr[i],target);
            ad.remove(ad.size()-1);
            k=arr[i];
            }
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Set<List<Integer>> set=new HashSet<>();
        Arrays.sort(candidates);
        ArrayList<Integer> a=new ArrayList<>();
        rec(candidates,0,set,a,0,target);
        return new ArrayList<>(set);
    }
}