class Solution {
    public boolean check(int[] nums) {
        int countrotate=0;
        int n=nums.length;
        int p;
        int start=nums[0];
        int last=nums[n-1];
        for(p=0;p<n-1;p++)
        {
            if(nums[p]<=nums[p+1])
                continue;
            else
                countrotate++;
        }
        if(countrotate==0 || (countrotate==1 && start>=last))
            return true;
        return false;
    }
}