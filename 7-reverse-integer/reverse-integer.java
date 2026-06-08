class Solution {
    public int reverse(int x) {
        int val=Integer.MAX_VALUE;
        if(x==Integer.MAX_VALUE || x==Integer.MIN_VALUE)
            return 0;
        int neg=1;
        if(x<0)
        {
            neg=-1;
            x*=-1;
        }
        int n=x, answer=0;
        while(n>=10)
        {
            int t=n%10;
            answer=answer*10+t;
            n/=10;
        }
        if(answer>val/10)
            return 0;
        return (answer*10+n%10)*neg;
    }
}