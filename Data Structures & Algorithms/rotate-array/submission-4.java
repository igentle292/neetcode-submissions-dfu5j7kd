class Solution {
    public void rotate(int[] nums, int k) {
        int rotate = k;
        while(rotate >= nums.length){
            rotate -= nums.length;
        }

        if(rotate == 0){
            return;
        }
        // int[] result = new int[nums.length];
        // for(int i=0; i<nums.length; i++){
        //     int rot_counter = (i + rotate) % nums.length;
        //     result[rot_counter] = nums[i];
        // }

        // for(int i=0; i<nums.length; i++){
        //     nums[i] = result[i];
        // }
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, rotate - 1);
        reverse(nums, rotate, nums.length - 1);
    }

    public void reverse(int[] nums, int start, int end){
        int left = start;
        int right = end;
        while(left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}