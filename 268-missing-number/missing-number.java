class Solution {
    public int missingNumber(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        int max=-1, n=nums.length;
        for(int p=0; p<n; p++)
        {
            hs.add(nums[p]);
            max=Math.max(max, nums[p]);
        }
        for(int p=0; p<=max; p++)
        {
            if(!hs.contains(p))
                return p;
        }
        return max+1;
    }
}