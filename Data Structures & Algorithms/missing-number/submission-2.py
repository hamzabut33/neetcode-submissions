class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        actualsum = 0
        expectedsum = 0
        for i in nums:
            actualsum += i
        for item in range(len(nums) + 1):
            expectedsum += item
        return expectedsum - actualsum 
        

