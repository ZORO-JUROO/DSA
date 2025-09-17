class Solution {
    void rec(int arr[],int i,ArrayList<List<Integer>> set, ArrayList<Integer> ad,int sum,int target)
    {
        if(sum==target)
        {set.add(ad);return;}
        if(sum>target)
        return;
        for(;i<arr.length;i++)
        {
            ArrayList<Integer> a=new ArrayList<>(ad);
            int m=target/arr[i],s=sum;
            for(int j=1;j<=m;j++)
            {
                a.add(arr[i]);
                ArrayList<Integer> v=new ArrayList<>(a);
                s=s+arr[i];
                rec(arr,i+1,set,v,s,target);
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