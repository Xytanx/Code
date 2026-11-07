class Solution {
    public int removeDuplicates(int[] nums) {
        int p1=0,p2=0, n=nums.length;
        nums[p1]=nums[0];
        for(p2=1; p2<n; p2++)
        {
            while(p2<n && nums[p2]==nums[p1])
                p2++;
            if(p2<n)
                nums[++p1]=nums[p2];
        }
        return p1+1;
    }
}