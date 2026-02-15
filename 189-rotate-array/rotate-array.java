class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        int turnpoint=n-k;
        int arr[]=new int[n];
        int start=0;
        for(int p=turnpoint; p<n;p++)
            arr[start++]=nums[p];
        for(int p=0;p<turnpoint;p++)
            arr[start++]=nums[p];
        for(int p=0;p<n; p++)
            nums[p]=arr[p];
    }
}