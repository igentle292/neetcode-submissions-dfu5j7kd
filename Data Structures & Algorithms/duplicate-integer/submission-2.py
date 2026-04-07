class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        # num_set = set((nums))
        # return len(num_set) != len(nums)
        
        # num_set = set(())
        # for i in range(len(nums)):
        #     num_set.add(nums[i])
        #     if len(num_set) == i:
        #         return True
        # return False

        num_set = set(())
        for num in nums:
            if num in num_set:
                return True
            num_set.add(num)
        return False