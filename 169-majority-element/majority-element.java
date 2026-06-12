class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        if(n==1)
            return nums[0];
        HashMap<Integer, Integer> hm=new HashMap<>();
        for(int p=0; p<n; p++)
        {
            if(hm.containsKey(nums[p]))
            {
                if(hm.get(nums[p])+1>n/2)
                    return nums[p];
                hm.put(nums[p], hm.get(nums[p])+1);
            }
            else
                hm.put(nums[p], 1);
        }
        return -1;
    }
}