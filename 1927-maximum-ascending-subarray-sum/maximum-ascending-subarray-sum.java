class Solution {
    public int maxAscendingSum(int[] nums) {
        int l=0, r=1, len=nums.length, maxsum=Integer.MIN_VALUE;int sum=nums[0];
        while(r<len)
        {
            while(r<len && nums[l]<nums[r])
            {
                sum+=nums[r];
                r++;
                l++;
            }
            l=r;
            maxsum=Math.max(maxsum, sum);
            if(l<len)
                sum=nums[l];
            r++;
        }
        return(Math.max(maxsum, sum));
    }
}