class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hash=new HashMap<>();
        int[] ar=new int[2];
        for(int i=0;i<nums.length; i++)
        {
            if(hash.containsKey(target-nums[i]))
            {
                ar[0]=hash.get(target-nums[i]);
                ar[1]=i;
                return ar;
            }
            hash.put(nums[i], i);
        }
        return ar;
    }
}