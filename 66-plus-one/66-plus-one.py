class Solution(object):
    def plusOne(self, digits):
        """
        :type digits: List[int]
        :rtype: List[int]
        """
        result = []
        
        nums = "".join(map(str, digits))
        nums = int(nums) + 1
        
        for x in str(nums):
            result.append(x)
        
        return result