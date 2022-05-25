class Solution {
    public int findKthPositive(int[] arr, int k) {
        
        int i = 0;
        int curr = 0;
        int missing = 0;
        
        while(k >= 0){
            if(i < arr.length && arr[i] == curr){
                i++;
            }
            else{
                k--;
                missing = curr;
            }
            curr++;
        }
        
        return missing;
    }
}