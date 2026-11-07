class Solution {
    public void moveZeroes(int[] nums) {
        int p1=0, p2=0, n=nums.length;
        if (n==0 || n==1)
            return;
        for(p2=0; p2<n; p2++)
        {
            while(p2<n && nums[p2]==0)
                p2++;
            if(p1<n && p2<n)
                nums[p1++]=nums[p2];
        }
        while(p1<n)
            nums[p1++]=0;
    }
}