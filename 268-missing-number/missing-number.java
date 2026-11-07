class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length, p;
        for(p=0; p<n; p++)
        {
            if(nums[p]!=p)
                return p;
        }
        return p;
    }
}