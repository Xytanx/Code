class Solution {
    public int removeDuplicates(int[] nums) {
        int temp=0,k=0, n=nums.length, p;
        for(p=0;p<n-1;p++)
        {
            while(temp<n && nums[p]==nums[temp])
                temp++; 
            if(temp<n)
            {   
                nums[p+1]=nums[temp];
                k++;
            }
        }
        return k+1;
    }
}