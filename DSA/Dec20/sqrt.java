class Solution {
    public int mySqrt(int x) {
        int start=0,end=x,mid;
        int ans=0;
        while(start<=end)
        {
            mid=start+(end-start)/2;
            if((mid * mid)==x)
            {
                ans = mid;
                break;
            }
             if((mid * mid) < x)
             {
                start = mid + 1;
                ans = mid;
             }   
            else
            {
                end = mid - 1;
            }
        }
        return ans;
    }
}
