class Solution {
    public int[] rearrangeArray(int[] nums) {
        int len=nums.length;
        int arr[]=new int[len];
        int l, r, possearch=0, negsearch=0;
        for(l=0, r=1; l<len && r<len; l=l+2, r=r+2)
        {
            while(possearch<len && nums[possearch]<0)
                possearch++;
            if(possearch<len)
                arr[l]=nums[possearch];
            possearch++;
            while(negsearch<len && nums[negsearch]>0)
                negsearch++;
            if(negsearch<len)
                arr[r]=nums[negsearch];
            negsearch++;
        }
        return arr;
    }
}