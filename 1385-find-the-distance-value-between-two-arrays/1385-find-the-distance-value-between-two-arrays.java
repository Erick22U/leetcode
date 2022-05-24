class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        
        int count = 0;
        boolean isValid = true;
        
        for(int i = 0; i < arr1.length; i++){
            isValid = true;
            
            for(int j = 0; j < arr2.length; j++){
                int dif = arr1[i] - arr2[j];
                if(Math.abs(dif) <= d){
                    isValid = false;
                    break;
                }
            }
            
            if(isValid){
                count++;
            }
        }
        
        return count;
    }
}