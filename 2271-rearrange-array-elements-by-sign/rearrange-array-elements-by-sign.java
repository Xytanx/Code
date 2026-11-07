class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int posi=0, negi=0;
        int posarray[]=new int[n/2];
        int negarray[]=new int[n/2];
        for(int p=0; p<n;p++)
            if(nums[p]>=0)
                posarray[posi++]=nums[p];
            else
                negarray[negi++]=nums[p];
        posi=0; negi=0;
        for(int p=0; p<n; p=p+2)
        {
            nums[p]=posarray[posi++];
            nums[p+1]=negarray[negi++];
        }
        return nums;
    }
}