class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
            dict = {}
            for i, num in enumerate(nums):
                needed = target - num
                if needed in dict:
                    return [dict[needed], i]
                dict[num] = i
            return []