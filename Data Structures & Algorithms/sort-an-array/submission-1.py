class Solution:
    def sortArray(self, nums: List[int]) -> List[int]:
        for i in range(len(nums)):
            swaps = False
            for j in range(len(nums) - 1):
                if nums[j] > nums[j + 1]:
                    temp = nums[j + 1]
                    nums[j + 1] = nums[j]
                    nums[j] = temp
                    swaps = True
            if not(swaps):
                return nums
        return nums
        