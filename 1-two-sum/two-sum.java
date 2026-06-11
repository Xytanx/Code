class Solution {
    public int[] twoSum(int[] nums, int target) {
        int len=nums.length;
        int arr[]=new int[2];
        HashMap<Integer, Integer> hm=new HashMap<>();
        for(int p=0; p<len; p++)
        {
            if(hm.containsKey(target-nums[p]))
            {
                arr[0]=hm.get(target-nums[p]);
                arr[1]=p;
                return arr;
            }
            else
                hm.put(nums[p], p);
        }
        return arr;
    }
}