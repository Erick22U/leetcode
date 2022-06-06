class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int l = 0;
        int r = nums.length - 1;
        
        while(l <= r){
            
            if(l == r)
                nums[l] = (int) Math.pow(nums[l], 2);
            else{
                nums[l] = (int) Math.pow(nums[l], 2);
                nums[r] = (int) Math.pow(nums[r], 2);
            }
            
            l++;
            r--;
        }
        
        Arrays.sort(nums);
        
        return nums;
    }
}