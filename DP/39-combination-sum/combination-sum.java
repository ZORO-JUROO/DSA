class Solution {
    void rec(int arr[],int i,ArrayList<List<Integer>> set, ArrayList<Integer> ad,int sum,int target)
    {
        if(sum==target)
        {set.add(new ArrayList<>(ad));return;}
        if(sum>target)
        return;
        for(;i<arr.length;i++)
        {
            int m=target/arr[i],s=sum,j;
            for(j=1;j<=m;j++)
            {
                ad.add(arr[i]);
                s=s+arr[i];
                rec(arr,i+1,set,ad,s,target);
            }
            for(;j>1;j--)
            {
                ad.remove(ad.size()-1);
            }
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        ArrayList<List<Integer>> set=new ArrayList<>();
        ArrayList<Integer> a=new ArrayList<>();
        rec(candidates,0,set,a,0,target);
        return set;
    }
}