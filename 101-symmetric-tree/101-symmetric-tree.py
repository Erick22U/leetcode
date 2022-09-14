# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def isSymmetric(self, root):
        """
        :type root: TreeNode
        :rtype: bool
        """
        if root is None:
            return True
        
        def isSymmetricLR(l, r):
            if l is None and r is None:
                return True
            elif l is None or r is None:
                return False
            
            if l.val != r.val:
                return False
            if not isSymmetricLR(l.left, r.right):
		        return False
            if not isSymmetricLR(l.right, r.left):
                return False
            
            return True
 
            
                
        return isSymmetricLR(root.left, root.right)
        
        