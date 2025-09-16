class Solution {
    void rec(int arr[],int i,ArrayList<List<Integer>> set,ArrayList<Integer> ad)
    {
        int k=-11;
        int remove=ad.size();
        for(;i<arr.length;i++)
        {
            if(k!=arr[i])
            {
                ad.add(arr[i]);
                ArrayList<Integer> list2 = new ArrayList<>(ad);
                set.add(list2);
                rec(arr,i+1,set,ad);
                ad.remove(remove);
                k=arr[i];
            }
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        ArrayList<List<Integer>> set=new ArrayList<>();
        ArrayList<Integer> a=new ArrayList<>();
        set.add(a);
        Arrays.sort(nums);
        rec(nums,0,set,a);
        return set;
    }
}