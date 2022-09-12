class Solution(object):
    def romanToInt(self, s):
        """
        :type s: str
        :rtype: int
        """
        roman = {
            'I': 1,
            'V': 5,
            'X': 10, 
            'L': 50,
            'C': 100,
            'D': 500,
            'M': 1000
        }
        
        result = 0
        
        for i, value in enumerate(s):
            if s[i] == 'V' or s[i] == 'X':
                if s[i - 1] == 'I' and i > 0:
                    result -= 2
            if s[i] == 'L' or s[i] == 'C':
                if s[i - 1] == 'X' and i > 0:
                    result -= 20
            if s[i] == 'D' or s[i] == 'M':
                if s[i - 1] == 'C' and i > 0:
                    result -= 200
            result += roman[value]
        
        return result