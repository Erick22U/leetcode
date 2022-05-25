class Solution {
    public int arrangeCoins(int n) {
        
        long l = 1;
        long r = n;
        long coin = 0;
        
        while(l <= r){
            long mid = l + (r - l)/2;
            long k = (mid * (mid + 1))/2;
            
            if(k > n){
                r = mid - 1;
            }
            else{
                coin = mid;
                l = mid + 1;
            }
        }
        
        return (int)coin;
    }
}