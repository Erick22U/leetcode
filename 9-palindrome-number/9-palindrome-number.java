class Solution {
    public boolean isPalindrome(int x) {
        
        String str = Integer.toString(x);
        
        int start = 0;
        int end = str.length() - 1;
        
        while(end > start){
            
            if(str.charAt(end) != str.charAt(start))
                return false;
            
            end--;
            start++;
        }
        
        return true;
    }
}