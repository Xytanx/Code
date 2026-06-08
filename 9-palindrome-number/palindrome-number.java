class Solution {
    public boolean isPalindrome(int x) {
        if (x==0)
            return true;
        if(x<0 || x%10==0)
            return false;
        int rev=0, n=x;
        while(n!=0)
        {
            int t=n%10;
            rev=rev*10+t;
            n/=10;
        }
        if(x==rev)
            return true;
        return false;
    }
}