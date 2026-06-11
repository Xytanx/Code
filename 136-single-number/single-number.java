class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> hm=new HashMap<>();
        int len=nums.length;
        for(int p=0; p<len; p++)
        {
            hm.put(nums[p], hm.getOrDefault(nums[p], 0)+1);
        }
        for(Map.Entry<Integer, Integer> entry: hm.entrySet())
        {
            int val=entry.getValue();
            if(val==1)
                return entry.getKey();
        }
        return -1;
    }
}