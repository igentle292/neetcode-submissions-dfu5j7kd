class Solution:
    def maxArea(self, heights: List[int]) -> int:
        l = 0
        r = len(heights) - 1
        area = 0
        while l < r:
            
            curr_area = min(heights[l], heights[r]) * (r - l)
            # print("current pointers: ", heights[l], " ", heights[r], "curr_area: ", curr_area)
            area = max(curr_area, area)
            # left_diff = heights[l + 1] - heights[l]
            # right_diff = heights[r - 1] - heights[r]
            # if left_diff > right_diff:
            if heights[l] < heights[r]:
                l += 1
            else:
                r -= 1

        return area
