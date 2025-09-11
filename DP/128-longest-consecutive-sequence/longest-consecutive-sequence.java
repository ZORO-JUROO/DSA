class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        Arrays.sort(nums);int max=1,s=1;
        System.out.println(Arrays.toString(nums));
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]+1==nums[i+1])
            s++;
            else if(nums[i]==nums[i+1]) continue;
            else
            {
                if(max<s)
                max=s;
                s=1;

            }
        }
        if(max<s)
                max=s;
        return max;
    }
}