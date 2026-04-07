class Solution {
    public int firstMissingPositive(int[] nums) {
        if(nums.length == 1){
            if(nums[0] != 1){
                return 1;
            } else{
                return 2;
            }
        } else{
            for(int i=0; i<nums.length; i++){
                if(nums[i] < 0){
                    nums[i] = 0;
                }
            }

            for(int i=0; i<nums.length; i++){
                int value = Math.abs(nums[i]);
                if(0 < value && value < nums.length + 1){
                    if(nums[value - 1] == 0){
                        nums[value - 1] = (nums.length + 1) * -1;
                    } else if(nums[value - 1] > 0){
                        nums[value - 1] *= -1;
                    }
                }
            }

            for(int i=1; i<nums.length + 1; i++){
                if(nums[i - 1] > -1){
                    return i;
                }
            }

            return nums.length + 1;
        }
    }
}