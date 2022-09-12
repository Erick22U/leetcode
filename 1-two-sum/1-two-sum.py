class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        seen = {}
        
        for i, value in enumerate(nums):
            
            if target - nums[i] in seen:
                return [i, seen[target - value]]
            
            else:
                seen[value] = i