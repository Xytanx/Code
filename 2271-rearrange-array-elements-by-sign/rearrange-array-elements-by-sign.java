class Solution {
    public int[] rearrangeArray(int[] nums) {
        int len=nums.length;
        int posarr[]=new int[len/2];
        int negarr[]=new int[len/2];
        int l=0, r=0;
        for(int p=0; p<len; p++)
            if(nums[p]>0)
                posarr[l++]=nums[p];
            else
                negarr[r++]=nums[p];
        l=0;
        for(int p=0; p<len; p++)
        {
            nums[p]=posarr[l];
            p++;
            nums[p]=negarr[l];
            l++;
        }
        return nums;
    }
}