class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0,k=0;
        for(int i:nums)
        {
            if(i==0)
            {max=Math.max(max,k);k=0;}
            else
            k++;
        }
        max=Math.max(max,k);
        return max;
    }
}