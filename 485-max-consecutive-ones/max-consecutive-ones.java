class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max1=0, len=nums.length, count=0;
        for(int p=0; p<len; p++)
        {
            if(nums[p]==1)
                count++;
            else{
                max1=Math.max(max1, count);
                count=0;
            }
        }
        return Math.max(max1, count);
    }
}