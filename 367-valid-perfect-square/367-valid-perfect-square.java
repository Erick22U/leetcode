class Solution {
    public boolean isPerfectSquare(int num) {
        
        int start = 1;
        int end = num;
        
        long mid = (start + end) / 2;
        long midsq;
        
        while(start <= end){
          
            midsq = mid * mid;
            
            if(midsq == num)
                return true;    
            else if(midsq > num)
                end = (int)mid - 1;
            else
                start = (int)mid + 1;
            mid = (start + end) / 2;
        }
        
        return false;
    }
}