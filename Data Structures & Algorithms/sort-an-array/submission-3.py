class Solution:
    def sortArray(self, nums: List[int]) -> List[int]:
        def mergeSort(nums: List[int], l, r):
            if l == r:
                return
            m = (l + r) // 2
            mergeSort(nums, l, m)
            mergeSort(nums, m + 1, r)
            merge(l, r, m, nums)
            return

        def merge(l, r, m, nums: List[int]):
            i = l
            l_count = 0
            r_count = 0

            left = nums[l:m+1]
            right = nums[m+1:r+1]

            while l_count < len(left) and r_count < len(right):
                if left[l_count] <= right[r_count]:
                    nums[i] = left[l_count]
                    l_count += 1
                    
                else:
                    nums[i] = right[r_count]
                    r_count += 1
                i += 1

            while l_count < len(left):
                nums[i] = left[l_count]
                i += 1
                l_count += 1

            while r_count < len(right):
                nums[i] = right[r_count]
                i += 1
                r_count += 1
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
        # for i in range(1, len(nums)):
        #     temp = nums[i]
        #     j = i - 1
        #     while j >= 0 and temp < nums[j]:
        #         nums[j + 1] = nums[j]
        #         j -= 1
        #     nums[j + 1] = temp

        # return nums
                
        #merge sort
        mergeSort(nums, 0, len(nums))
        return nums
    
                    