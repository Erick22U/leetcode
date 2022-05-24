class Solution {
    public int mySqrt(int x) {
        
        int l = 0;
        int r = x;
        
        while(l <= r){
            int mid = l + (r - l)/2;
            
            if((long)mid * mid == x){
                return mid;
            }
            if((long)mid * mid < x){
                l = mid + 1;
            }
            else if((long)mid * mid > x){
                r = mid - 1;
            }
        }
        
        return r;
    }
}