class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int r = letters.length;
        int l = 0;
        
        while(l < r){
            int mid = l + (r - l)/2;
            
            if(letters[mid] <= target)
                l = mid + 1;
            else
                r = mid;
        }
        
        return letters[l % letters.length];
    }
}