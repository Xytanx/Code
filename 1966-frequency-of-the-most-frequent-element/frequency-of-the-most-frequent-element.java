class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int l=0, r=0, maxwindow=0, len=nums.length;
        long total=0;
        while(r<len)
        {
            total+=nums[r];
            while((long)((long)nums[r]*(long)(r-l+1))>(total+k)) //fail condition
            {
                total-=nums[l];
                l++;
            }
            maxwindow=Math.max(maxwindow, r-l+1);
            r++;
        }
        return maxwindow;
    }
}