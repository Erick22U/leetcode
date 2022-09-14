class Solution(object):
    def lengthOfLastWord(self, s):
        """
        :type s: str
        :rtype: int
        """
        strings = s.split()
        
        print(strings)
        return len(strings[len(strings) - 1])