class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length, p=0;
        int arr[]=new int[n];
        for(int i=0; i<n; i++)
            if(nums[i]!=0)
                arr[p++]=nums[i];
        for(p=0;p<n;p++)
            nums[p]=arr[p];
    }
}