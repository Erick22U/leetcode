class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        
        int l = 0;
        
        while(arr[l] < arr[l + 1]){
            l++;
        }
        
        return l;
    }
}