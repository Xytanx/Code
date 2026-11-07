class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int mid=n/2;
        HashMap<Integer, Integer> hm=new HashMap<>();
        for(int p=0; p<n; p++)
        {
            hm.put(nums[p], hm.getOrDefault(nums[p], 0)+1);
            if(hm.get(nums[p])>mid)
                return nums[p];
        }
        return -1;
    }
}