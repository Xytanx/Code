class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int p, max=0, counter=0;
        for(p=0; p<nums.length;p++)
        {
            if(nums[p]==1)
                counter++;
            else
            {
                max=Math.max(max, counter);
                counter=0;
            }
        }
        return max=Math.max(max, counter);
    }
}