class Solution {
    public int search(int[] nums, int target) {
        int lower = 0;
        int upper = nums.length;

        if(nums[lower] == target){
                return lower;
        } else if(nums[upper - 1] == target){
            return upper - 1;
        }

        int mid = 0;
        while(lower <= upper && lower < (nums.length - 1) && upper >= 0){
            mid = ((upper - lower) / 2) + lower;
            // if(mid < lower){
            //     mid = lower;
            // } else if(mid > upper){
            //     mid = upper;
            // }

            if(nums[mid] == target){
                return mid;
            }

            if(nums[mid] < target){
                lower = mid + 1;
            } else{
                upper = mid - 1;
            }
        }
        if(nums[mid] != target){
            return -1;
        } else{
            return mid;
        }
        
    }
}
