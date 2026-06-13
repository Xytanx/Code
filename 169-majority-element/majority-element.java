class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int ans=0, freq=0;
        for(int p:nums)
        {
            if(freq==0)
                ans=p;
            if(p==ans)
                freq++;
            else
                freq--;
        }
        return ans;
    }
}