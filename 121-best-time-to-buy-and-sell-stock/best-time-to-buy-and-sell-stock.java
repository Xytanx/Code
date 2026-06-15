class Solution {
    public int maxProfit(int[] prices) {
        int maxpro=Integer.MIN_VALUE, l=0, r=0, len=prices.length;
        while(r<len && l<=r)
        {
            if(prices[r]<prices[l])
            {
                l=r;
                r++;
            }
            else
            {
                maxpro=Math.max(prices[r]-prices[l], maxpro);
                r++;
            }
        }
        return maxpro;
    }
}