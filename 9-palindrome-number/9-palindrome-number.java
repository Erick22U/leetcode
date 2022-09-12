class Solution(object):
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        l = 0
        r = len(str(x)) - 1
        
        while l <= r:
            if str(x)[l] != str(x)[r]:
                return False
            l += 1
            r -= 1
        return True