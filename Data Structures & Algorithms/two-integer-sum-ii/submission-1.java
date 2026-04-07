class Solution {
    public int[] twoSum(int[] numbers, int target) {
        if(numbers.length == 2){
            return new int[]{1,2};
        } 

        for(int i=0; i<numbers.length; i++){
            int result = search(numbers, target - numbers[i]);
            if(result != -1){
                return new int[]{i + 1,result + 1};
            }
        }

        return new int[]{0,1};
    }

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
            if(upper < nums.length && nums[upper] == target){
                return upper;
            } else if(nums[lower] == target){
                return lower;
            }
            
            mid = (upper - lower) / 2;
            if(mid < lower){
                mid = lower;
            } else if(mid > upper){
                mid = upper;
            }

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
