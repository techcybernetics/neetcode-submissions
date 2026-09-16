class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        count = 0
        mx = 0
        for i in nums:
            if i == 1:
                count+=1
                mx=max(count,mx)
            else:
                count=0
                
        return mx