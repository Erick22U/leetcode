class Solution {
    public int romanToInt(String s) {
        
        int result = 0;
        
        for(int i = 0; i <= s.length() - 1; i++){
            
            if(s.charAt(i) == 'I'){
                try{
                    if(s.charAt(i + 1) == 'V'){
                        result += 4;
                        i += 1;
                    }
                    else if(s.charAt(i + 1) == 'X'){
                        result += 9;
                        i += 1;
                    }
                    else{
                        result += 1;
                    }
                }
                catch (Exception e) {
                    result += 1;
                }
            }
            
            else if(s.charAt(i) == 'X'){
                try{
                    if(s.charAt(i + 1) == 'L'){
                        result += 40;
                        i += 1;
                    }
                    else if(s.charAt(i + 1) == 'C'){
                        result += 90;
                        i += 1;
                    }
                    else{
                        result += 10;
                    }
                }
                catch (Exception e) {
                    result += 10;
                }
            }
            
            else if(s.charAt(i) == 'C'){
                try{
                    if(s.charAt(i + 1) == 'D'){
                        result += 400;
                        i += 1;
                    }
                    else if(s.charAt(i + 1) == 'M'){
                        result += 900;
                        i += 1;
                    }
                    else{
                        result += 100;
                    }
                }
                catch (Exception e) {
                    result += 100;
                }
            }
            
            else if(s.charAt(i) == 'L'){
                    result += 50;
            }
            else if(s.charAt(i) == 'V'){
                    result += 5;
            }
            else if(s.charAt(i) == 'X'){
                    result += 10;
            }
            else if(s.charAt(i) == 'C'){
                    result += 1000;
            }
            else if(s.charAt(i) == 'D'){
                    result += 500;
            }
            else if(s.charAt(i) == 'M'){
                    result += 1000;
            }
        }
        
        return result;
    }
}