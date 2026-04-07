class Solution:
    def sortArray(self, nums: List[int]) -> List[int]:
        #bubble sort
        # for i in range(len(nums)):
        #     swaps = False
        #     for j in range(len(nums) - 1):
        #         if nums[j] > nums[j + 1]:
        #             temp = nums[j + 1]
        #             nums[j + 1] = nums[j]
        #             nums[j] = temp
        #             swaps = True
        #     if not(swaps):
        #         return nums
        # return nums
        
        #insertion sort
        for i in range(1, len(nums)):
            temp = nums[i]
            j = i - 1
            while j >= 0 and temp < nums[j]:
                nums[j + 1] = nums[j]
                j -= 1
            nums[j + 1] = temp

        return nums
                
                    