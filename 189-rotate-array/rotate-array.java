class Solution {
    void RotateArray(int nums[], int start, int end)
    {
        end=end-1;
        while (start < end) 
        {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        if(n==1 || n==0)
            return;
        k=k%n;
        RotateArray(nums, 0, n);
        RotateArray(nums, k, n);
        RotateArray(nums, 0, k);
    }
}