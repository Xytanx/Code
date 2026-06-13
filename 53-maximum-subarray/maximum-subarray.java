class Solution {
    public int maxSubArray(int[] nums) {
        int len=nums.length;
        if(len==1)
            return nums[0];
        int max=nums[0], sum=nums[0];
        for(int p=1; p<len; p++)
        {
            if(sum<0 && nums[p]>sum)
            {
                sum=nums[p];
                max=Math.max(max, sum);
                continue;
            }
            sum+=nums[p];
            max=Math.max(max, sum);

        }
        return Math.max(max, sum);
    }
}